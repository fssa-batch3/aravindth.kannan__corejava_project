package day03.practice;

public class User {
	
	private String name;
	private String pass;
	private String email;
	
	public void User(String name,String pass, String email) {
		this.name = name;
		this.pass = pass;
		this.email = email;
	}
	
	public String getName() {
		return name;
	}
	 public String getPass() {
		 return pass;
	 }
	 public String getEmail() {
		 return email;
	 }

	public static void main(String[] args) {
		User user = new User();
		user.User("Aravindth", "Akkam432@", "aravindth@gmail.com");
		
		System.out.println("Name : "+user.getName());
		System.out.println("Password : "+user.getPass());
		System.out.println("Email id : "+user.getEmail());
	}

}
