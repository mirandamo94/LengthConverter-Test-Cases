package lengthConvert;

import static org.junit.Assert.*;
import org.junit.*;

import static lengthConvert.LengthConverter.*; 

public class LengthConverterTest {
	
	@Test
	public void testkmToMile1(){
		double km = 29475.2817264;
		assertTrue(kmToMile(km)==18315.090940868988);
	}
	@Test
	public void testkmToMile2(){
		double km = 998475.482634;
		assertTrue(kmToMile(km)==620423.900827064);
	}
	@Test(expected=IllegalArgumentException.class)
	  public void testkmtoMile3() {
		kmToMile(-56);
	  }
	
	@Test
	  public void testkmToMile4() {
		try {
			kmToMile(-56);
		  fail("Exception should have occurred");
		} catch (IllegalArgumentException exception) {
		  assertEquals(exception.getMessage(), "Input number cannot be negative!");
		}
	  }

	@Test
	public void testmileToKm1(){
		double mile = 3.4556;
		assertTrue(mileToKm(mile)==5.56124912852413);
	}
	@Test
	public void testmileToKm2(){
		double mile = 100.0;
		assertTrue(mileToKm(mile)==160.9344000614692);
	}
	@Test(expected=IllegalArgumentException.class)
	  public void testmileToKm3() {
		mileToKm(-56383785.1);
	  }
	
	@Test
	  public void testmileToKm4() {
		try {
			mileToKm(-56.28374);
		  fail("Exception should have occurred");
		} catch (IllegalArgumentException exception) {
		  assertEquals(exception.getMessage(), "Input number cannot be negative!");
		}
	  }
	
}
