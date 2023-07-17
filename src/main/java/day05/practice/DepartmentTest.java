package day05.practice;

public class DepartmentTest {
	public static void main(String[] args) {
        Department department = new Department("biology", 678);
        Student student = new Student("Aravindth", 202, department);
        System.out.println(student);
    }
}