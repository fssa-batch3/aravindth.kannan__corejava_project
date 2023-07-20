package day09.practice;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class SortArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[5];
		
		
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			list.add(arr[i]);
		}
		
		Collections.sort(list);
		
		System.out.println(list);
		

	}

}
