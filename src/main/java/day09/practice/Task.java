package day09.practice;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Comparator;
import java.time.LocalDate;


public class Task {
	
	
		private int id;
		private String name;
	  private LocalDate deadline;
	  
	  public Task(int id, String name, LocalDate date) {

			this.id = id;
			this.name = name;
			this.deadline = date;
		}
	  
	  public int getId() {
		  return id;
	  }
	  public String getName() {
		  return name;
	  }
	  
	  public LocalDate getDate() {
		  return deadline;
	  }
	  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task obj = new Task(34,"Aravindth", LocalDate.of(2023, 7, 22));
		Task obj1 = new Task(34,"Prakash", LocalDate.of(2022, 6, 12));
		Task obj2 = new Task(44,"Kavi",LocalDate.of(2021, 6, 22));
		
		ArrayList<Task> list = new ArrayList<>();
		list.add(obj);
		list.add(obj1);
		list.add(obj2);
		
		Collections.sort(list,Comparator.comparing(Task::getDate));
		
		 for (Task task : list) {
             System.out.println(task.getId() + "," + task.getName() + "," + task.getDate());
         }
		
		
		
	}

}
