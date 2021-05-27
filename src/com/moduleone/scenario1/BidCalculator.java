package com.moduleone.scenario1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class BidCalculator {
	public static Scanner scn;
	public static Map<String, Integer> bidDetails;
	public static boolean menuFlag = true;
	public static String[] businessManName;
	
	public static void enterBid() {
		System.out.println("Enter the Business Man Name:");
		String name = scn.next();
		System.out.println("Enter the bid amount:");
		Integer bidAmount= scn.nextInt();
		bidDetails.put(name, bidAmount);
		
		System.out.println("Press 1 for another business man name and bid amount!");
		System.out.println("Press anything else for main menu! (Enter numeric)");
		int input = scn.nextInt();
		
		if(input == 1) enterBid();
		else return;
	}

	private static void displayBidResult() {
		businessManName = new String[bidDetails.size()];
		for (Map.Entry<String, Integer> entry : bidDetails.entrySet()) {
			
			for(int i =0; i<bidDetails.size(); i++) businessManName[i] = entry.getKey();
			
		}
		System.out.println(bidDetails.get(businessManName[0]));
		System.out.println(bidDetails.get(businessManName[1]));
		
		if((int)(bidDetails.get(businessManName[0])) > ((int)bidDetails.get(businessManName[1]))) System.out.println(businessManName[0] +"won the bid");
		else System.out.println(businessManName[1] +" won the bid");
		
	}
	
	public static void main(String[] args) {
		scn = new Scanner(System.in);
		bidDetails = new HashMap<String, Integer>();
		
		while(menuFlag) {
			System.out.println("Select the options!!!!!!!!!!!!!!!");
			System.out.println();
			System.out.println("Enter 1: Enter the business man name and bid amount!");
			System.out.println("Enter 2: To display the result!");
			System.out.println("Enter 3: To Exit the application");
			int userInput = scn.nextInt();
			
			if(userInput == 1) enterBid();
			else if(userInput == 2) displayBidResult();
			else {
				System.out.println("Thanks for using the application!!!!!!!!!!!");
				menuFlag = false;
			}
		}
		
	}

}
