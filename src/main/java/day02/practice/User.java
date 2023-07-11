package day02.practice;

public class User {
		private int id;
		private String name;
		private String password;
		private String email;
	
	// Calculating Area for Circle
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
public String getPass() {
	return password;
}
public void setPass(String password) {
	this.password = password;
}

public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
	


	public static void main(String[] args) {
      User user = new User();
      user.setId(24);
      user.setName("Aravindth");
      user.setPass("Akkam432@");
      user.setEmail("Aravindth@gmail.com");
      
      System.out.println("User Id :" + user.getId());
      System.out.println("User Name :" + user.getName());
      System.out.println("User Password :" + user.getPass());
      System.out.println("User Email :" + user.getEmail());
		}

	

 }
		

	


