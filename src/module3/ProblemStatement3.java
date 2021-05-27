package module3;

import java.util.Scanner;

public class ProblemStatement3 {
	public static void performOperation(int value1, int value2) {
		System.out.println("Addition of "+value1 +" & "+value2+" is : "+(value1+value2));
		
		System.out.println("Subtraction of "+value1 +" & "+value2+" is : "+(value1-value2));
		
		System.out.println("Multiplication of "+value1 +" & "+value2+" is : "+(value1*value2));
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter value1 :");
		int value1 = scn.nextInt();
		
		System.out.println("Enter value2");
		int value2 = scn.nextInt();
		
		performOperation(value1, value2);
		
		scn.close();
	}
	
}
