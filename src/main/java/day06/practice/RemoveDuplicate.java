package day06.practice;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicate {

	public static void main(String[] args) {
			
			
			List<String> cityList = new ArrayList<String>();
				cityList.add("Tamilnadu");
				cityList.add("kerala");
				cityList.add("karnataka");
				cityList.add("delhi");
				cityList.add("Tamilnadu");
				
				List<String> RCityList = new ArrayList<String>();
				
				for (String city : cityList) {
		            if (!RCityList.contains(city)) {
		                RCityList.add(city);
		            }
		        }
				
				
				for (String city : RCityList) {
		            System.out.println(city);
		        }
		
// Add logic to remove the duplicate Array and 
// store the unique city name is an another ArrayList

	}

}
