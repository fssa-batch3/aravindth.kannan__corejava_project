package day06.practice;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicate {
	
public static List<String> Remove(String str){
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
	
	return RCityList;
	
	
}

	public static void main(String[] args) {
		
		
			
			System.out.println(Remove("Tamilnadu"));

		
// Add logic to remove the duplicate Array and 
// store the unique city name is an another ArrayList

	}

}
