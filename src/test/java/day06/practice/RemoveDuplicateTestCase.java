package day06.practice;
import day06.practice.RemoveDuplicate;
import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicateTestCase {
	
	

	public static void main(String[] args) {
		
		RemoveDuplicate remove = new RemoveDuplicate();
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
		
		
//		if(RemoveDuplicate.Remove("Tamilnadu") == RCityList) {
//			System.out.println("Remove duplicate is Working");
//			
//		}else {
//			System.out.println("Remove duplicate is not working");
//		}
		System.out.println(RemoveDuplicate.Remove("Tamilnadu"));
		  
	}

}
