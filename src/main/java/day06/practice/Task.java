package day06.practice;
import java.lang.reflect.Array;

import java.util.ArrayList;

public class Task {
	public String taskName;
    public int priority;
    
     public Task(String name, int p) {
		this.taskName = name;
		this.priority = p;
	}
	public String fullString() {
		return "Task name" + taskName + "Priority" + priority;
	}
	

	public static void main(String[] args) {
		ArrayList<Task> arr = new ArrayList<>();
		arr.add(new Task("Aravindth", 4));
		arr.add(new Task("Kavi", 5));
		arr.add(new Task("mathi", 7));
		System.out.println(arr);
		
		
	}

}
