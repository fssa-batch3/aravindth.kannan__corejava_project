package day07.practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

public class Task {

	public int id;
	public String name;
	public LocalDate deadline;

    public Task(String name, int id,String date) {
        this.name = name;
        this.id = id;
        this.deadline = LocalDate.parse(date);
    }

    

    public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public LocalDate getDeadline() {
		return deadline;
	}



	public void setDeadline(LocalDate deadline) {
		this.deadline = deadline;
	}



	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", deadline=" + deadline ;
	}


    @Override
	public int hashCode() {
		return Objects.hash(deadline, id, name);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Task other = (Task) obj;
		return Objects.equals(deadline, other.deadline) && id == other.id && Objects.equals(name, other.name);
	}



	public static void main(String[] args) {
        ArrayList<Task> arr = new ArrayList <> ();
        Task task1 = new Task("Car Wash",1,"2011-09-01");
        Task task4 = new Task("Car Wash",4,"2011-09-01");
        Task task2 = new Task("Shopping",3,"2012-05-15");
        Task task3 = new Task("Haircut",5,"2013-02-24");
        arr.add(task1);
        arr.add(task2);
        arr.add(task3);
        arr.add(task4);

        HashSet<Task> distinctTask = new HashSet<>(arr);

        for (Task i: distinctTask) {
            System.out.println(i);
        }

    }
}