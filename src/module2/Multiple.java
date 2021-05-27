package module2;

public class Multiple {
	
	public static void multiple(int value1 , int value2) {
		System.out.println("Multiple of value1 and value2 is "+ (value1*value2));
	}
	
	public static void multiple(int value1 , float value2) {
		System.out.println("Multiple of value1 and value2 is "+ (value1*value2));
	}
	
	public static void multiple(float value1 , float value2) {
		System.out.println("Multiple of value1 and value2 is "+ (value1*value2));
	}
	
	public static void multiple(float value1 , int value2) {
		System.out.println("Multiple of value1 and value2 is "+ (value1*value2));
	}
	
	public static void main(String[] args) {
		multiple(12,13);
		multiple(12, 11.7f);
		multiple(11.2f, 2.3f);
		multiple(1.7f , 4);
	}
}
