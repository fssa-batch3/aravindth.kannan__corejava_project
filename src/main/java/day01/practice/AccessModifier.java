package day01.practice;

public class AccessModifier {
	private  String a = "a";
	private static String b = "b";
	private static String c = "c";
	private static String d = "d";
	
	public String changeValue(String a) {
		 a = "a";
		 return a;
	}
	
	public static void main(String[] args) {
		AccessModifier  obj = new AccessModifier();
		 obj.changeValue("a");
		 System.out.println(obj.changeValue("a"));
		
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);		
	}
}

