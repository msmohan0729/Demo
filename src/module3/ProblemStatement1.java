package module3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ProblemStatement1 {
	static ArrayList<String> arr;
	static Scanner scn;
	static boolean menuFlag = true;
	static boolean addFlag = true;
	
	public static void addValue() {
		System.out.println("Enter the value to be inserted:");
		String input = scn.next();
		arr.add(input);
		
		System.out.println("Press 1 to continue entering another value");
		int choice = scn.nextInt();
		
		if(choice == 1) addValue();
		else return;
	}
	
	private static void deleteInput() {
		Iterator<String> itr = arr.iterator();
		while(itr.hasNext()) System.out.println(arr.remove(0));
		
	}
	
	private static void displayValues() {
		for(int index=0; index< arr.size();index++) System.out.println(arr.get(index));
	}

	public static void main(String[] args) {
		scn= new Scanner(System.in);
		arr = new ArrayList<String>();
		
		while(menuFlag) {
			System.out.println();
			System.out.println("Select an Options from below!!!!");
			System.out.println();
			System.out.println("Press 1 : To add a value");
			System.out.println("Press 2 : Delete the added value");
			System.out.println("Press 3 : Display values in the ArrayList");
			System.out.println("Enter any other number to exit");
			int userInput = scn.nextInt();
			
			if(userInput ==1) addValue();
			else if(userInput == 2) deleteInput();
			else if(userInput == 3) displayValues();
			else {
				System.out.println("Thnaks for using the Application!!!!!");
				menuFlag = false;
			}
		
		}
	}


}
