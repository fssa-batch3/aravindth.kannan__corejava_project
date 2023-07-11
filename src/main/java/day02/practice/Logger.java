package day02.practice;

	public class Logger {
		public static void debug (String msg) {
			System.out.println("DEBUG: " + msg);
		}
		public static void info (String msg) {
			System.out.println("INFO: " + msg);
		}
		public static void info (int msg) {
			System.out.println("INFO: " + msg);
		}
		
		public static void error (String msg) {
			System.out.println("ERROR: " + msg);
		}
		public static void error (int msg) {
			System.out.println("ERROR: " + msg);
		}
		
		public static void debug (int num) {
			System.out.println("DEBUG: " + num);
		}
		
		public static void main(String[]args) {
			
		debug("Debugging");
			debug(123);
			info("Info");
			info(345);
			error(567);
			error("Error");
			
			
		}
		
		// Similarly write overloaded methods for error and info.
	}

