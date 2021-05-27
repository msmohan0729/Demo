package module2;

import java.util.Scanner;

public class CardMessages {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter your slection from 1 to 10");
		int selection = scn.nextInt();
		
		switch(selection) {
		case 1: System.out.println("You have selected card 1!!");
		break;
		
		case 2: System.out.println("You have selected card 2!");
		break;
		
		case 3: System.out.println("You have selected card 3!");
		break;
		
		case 4: System.out.println("You have selected card 4!");
		break;
		
		case 5: System.out.println("You have selected card 5!");
		break;
		
		case 6: System.out.println("You have selected card 6!");
		break;
		
		case 7: System.out.println("You have selected card 7!");
		break;
		
		case 8: System.out.println("You have selected card 8!");
		break;
		
		case 9: System.out.println("You have selected card 9!");
		break;
		
		case 10: System.out.println("You have selected card 10!");
		break;
		
		default: System.out.println("Invalid selection");
		}
		scn.close();
	}
}
