package day08.practice;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StringUsingHashMapCount {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		String [] arr = str.split(",");
		
		HashMap<String,Integer> list = new HashMap<>();
		for(String string : arr) {
			list.put(string.toLowerCase().trim(),list.getOrDefault(string.toLowerCase().trim(),0)+1);
		}
		for(Map.Entry<String, Integer> arrList : list.entrySet()) {
			String name = arrList.getKey();
			int num = arrList.getValue();
			System.out.println("Name : " + name + " : " + num);
			
		}
		
		
	}

}
