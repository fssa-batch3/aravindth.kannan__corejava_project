package day10.solved;

import java.util.regex.Pattern;

public class InValidEmailException {
	
	public static boolean isValidEmail(String emailId) throws InvalidEmailException{
		boolean result = true;
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String email = "kaviprakash594@gmail.com";
		String regex = "^.*@.*\\..*$";
		
		Boolean isMatch = Pattern.matches(regex, email);

		if (isMatch) {
			System.out.println("The email address is: Valid");
		} else {
			System.out.println("The email address is: Invalid");
		}
	}

}
