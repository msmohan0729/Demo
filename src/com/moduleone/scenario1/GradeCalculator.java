package com.moduleone.scenario1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GradeCalculator {
	public static Map<String, Integer> studentDetails;
	public static Scanner scn;
	public static boolean menuFlag = true;

	public static String gradeCalculator(int averageMark) {
		if (averageMark >= 90)
			return "Excellent";
		else if (averageMark >= 80 && averageMark <= 89)
			return "Very Good";
		else if (averageMark >= 60 && averageMark <= 79)
			return "Good";
		else if (averageMark >= 40 && averageMark <= 59)
			return "Average";
		else
			return "Poor";
	}

	public static void enterStudentDetails() {
		System.out.println("Enter the Student name: ");
		String studentName = scn.next();

		System.out.println("Enter Mathematics mark of " + studentName + " :");
		int mathematicsMark = scn.nextInt();

		System.out.println("Enter English mark of " + studentName + " :");
		int englishMark = scn.nextInt();

		System.out.println("Enter Science mark of " + studentName + " :");
		int scienceMark = scn.nextInt();

		System.out.println("Enter Social Science mark of " + studentName + " :");
		int socialScienceMark = scn.nextInt();

		int totalMarks = mathematicsMark + englishMark + scienceMark + socialScienceMark;
		int averageMarks = totalMarks / 4;

		studentDetails.put(studentName, averageMarks);

		System.out.println("Press 1 to continue to enter another student details!!!");
		System.out.println("Press anything else for the main menu");
		int input = scn.nextInt();

		if (input == 1)
			enterStudentDetails();
		else
			return;
	}

	private static void displayStudentGrades() {

		for (Map.Entry<String, Integer> entry : studentDetails.entrySet()) {
			System.out.println();
			System.out.println(entry.getKey() + " has " + gradeCalculator((int) entry.getValue()) + " performance with "
					+ entry.getValue() + "%");
			System.out.println();
		}
	}

	public static void main(String[] args) {
		scn = new Scanner(System.in);
		studentDetails = new HashMap<String, Integer>();
		while (menuFlag) {
			System.out.println("Select your options!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			System.out.println();
			System.out.println("Enter 1: For entering student details!");
			System.out.println("Enter 2: For displaying the student grades!");
			System.out.println("Enter 3: To Exit!!");
			int userInput = scn.nextInt();

			if (userInput == 1)
				enterStudentDetails();
			else if (userInput == 2)
				displayStudentGrades();
			else {
				System.out.println();
				System.out.println("Thanks for using the application!!!!!");
				System.out.println();
				menuFlag = false;
			}
		}

		scn.close();
	}
}
