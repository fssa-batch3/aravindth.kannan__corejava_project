package day07.practice;
import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicateByHashSet {

	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(6);
		arr.add(5);
		arr.add(6);
		arr.add(7);
		arr.add(2);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		System.out.println("Before remove  " + arr);
		HashSet<Integer> list = new HashSet<Integer>(arr);
		System.out.println("After remove  " + list);
		
		
	}
	}


