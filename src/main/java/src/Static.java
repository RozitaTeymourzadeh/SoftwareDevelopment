package src;

public class Static {
	private static int number;
	
	public void setNumber() {
		// Warning the static field should access through static way
		this.number = 1;
	}
	
	public static void main(String[] args) {
		(new Static()).setNumber();
		System.out.println("End");
	}
}

//public class StaticOne {
//	private int number;
//	
//	public static void main(String[] args) {
//		// Error! Can not use this in static context
//		this.number = 5;
//	}
//}