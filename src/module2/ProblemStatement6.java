package module2;

import java.util.Scanner;

public class ProblemStatement6 {
	public static Scanner scn;
	public static boolean mathematicsFlag = true;
	public static boolean englishFlag = true;
	public static boolean scienceFlag = true;
	public static boolean socialScienceFlag = true;
	public static int mathematicsMark;
	public static int englishMark;
	public static int scienceMark;
	public static int socialScienceMark;
	public static int totalMark;
	public static double averageMark;
	public static boolean menuFlag = true;
	
	
	public static boolean verifyMark(int mark) {
		if (mark <= 100 && mark >= 0) return true;
		else return false;
	}
	
	public static void printErrorMessage() {
		System.out.println();
		System.err.println("The mark should be between 0 to 100!");
		System.out.println();
	}
	
	public static double userInput() {
		while (mathematicsFlag) {
			System.out.println("Enter mathemetics mark of the student");
			System.out.println();
			mathematicsMark = scn.nextInt();
			if (verifyMark(mathematicsMark)) mathematicsFlag = false;
			else printErrorMessage();
		}
		
		while (englishFlag) {
			System.out.println("Enter English mark of the student");
			System.out.println();
			englishMark = scn.nextInt();
			if (verifyMark(englishMark)) englishFlag = false;
			else printErrorMessage();
		}
		
		while (scienceFlag) {
			System.out.println("Enter Science mark of the student");
			System.out.println();
			scienceMark = scn.nextInt();
			if (verifyMark(scienceMark)) scienceFlag = false;
			else printErrorMessage();
		}
		
		while (socialScienceFlag) {
			System.out.println("Enter Social Science mark of the student");
			System.out.println();
			socialScienceMark = scn.nextInt();
			if (verifyMark(socialScienceMark)) socialScienceFlag = false;
			else printErrorMessage();
		}
		
		totalMark = mathematicsMark+englishMark+scienceMark+socialScienceMark;
		averageMark = totalMark/4;
		
		return averageMark;
	}
	
	private static void checkGrade(double average) {
		if (averageMark >= 90)
			System.out.println("Excellent");
		else if (averageMark >= 80 && averageMark <= 89)
			System.out.println("Very Good");
		else if (averageMark >= 60 && averageMark <= 79)
			System.out.println("Good");
		else if (averageMark >= 40 && averageMark <= 59)
			System.out.println("Average");
		else
			System.out.println("Poor");
		
	}
	

	public static void main(String[] args) {
		scn = new Scanner(System.in);
		
		while(menuFlag) {
			System.out.println();
			System.out.println("Select your Options!!!!");
			System.out.println("Enter 1: To calculate student grade");
			System.out.println("Enter 2: Exit");
			int userInput = scn.nextInt();
			
			if(userInput == 1) {
				double average =userInput();
				checkGrade(average);
			}
			else if(userInput == 2) {
				System.out.println("Thanks for using the Application!");
				menuFlag=false;	
			}
			else {
				System.err.println("Invalid selection, please select again!!!!!!!");
			}
		}
		scn.close();
	}


}
