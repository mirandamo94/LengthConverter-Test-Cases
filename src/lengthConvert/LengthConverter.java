package lengthConvert;

public class LengthConverter {
	
	static double convertedNum;
	
	 /**
	   * Performs a conversion where it converts kilometer to mile
	   *
	   * @return converted number in miles
	   */
	
	public static double kmToMile(double km){
		if (km < 0) {
			throw new IllegalArgumentException("Input number cannot be negative!");
			}
		convertedNum = km * 0.621371192;
		return convertedNum;
	}
	
	/**
	   * Performs a conversion where it converts mile to kilometer
	   *
	   * @return converted number in kilometer
	   */
	public static double mileToKm(double mile){
		
		if (mile < 0) {
			throw new IllegalArgumentException("Input number cannot be negative!");
			}
		convertedNum = mile / 0.621371192;
		return convertedNum;
		
	}
	
	public static double getResult(){
		return convertedNum;
	}
	
	 public static void main( String [ ] args ) {
			double[] doubleArray = { 29475.2817264, 0, 998475.482634, 2873, 100 }; 
			for (int i = 0; i < doubleArray.length; i++){
			  System.out.println( "Converting " + doubleArray[i] + " to miles " + kmToMile(doubleArray[i])); 	  
		  }
	 		System.out.println("Km to mile conversion complete.");
	 		
	 		for (int i = 0; i < doubleArray.length; i++){
				  System.out.println( "Converting " + doubleArray[i] + " to kilometers " + mileToKm(doubleArray[i])); 	  
			  }
		 		System.out.println("mile to km conversion complete.");
	

}
}
