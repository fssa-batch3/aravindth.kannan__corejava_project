
package day06.solved;


public class StringArray {

	public static void main(String[] args) {

		// How its stored in an normal array
		String[] cityArr = new String[5];
		cityArr[0] = "Chennai";
		cityArr[1] = "Bangalore";
		cityArr[2] = "Mumbai";
		cityArr[3] = "Thoothukudi";

		// Display the city names
		for (String cityName : cityArr) {
			System.out.println(cityName);
		}
		
		cityArr[1] = "Kolkata";
		
		for (String cityName : cityArr) {
			System.out.println(cityName);
		}
		
		for (String cityName : cityArr) {
			if(!cityName.equals ("Mumbai")) {
				
				System.out.println(cityName);
				
			}
			
		}
		System.out.println(cityArr.length);
	
	}
}