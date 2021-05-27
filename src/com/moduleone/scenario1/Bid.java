package com.moduleone.scenario1;

import java.util.Scanner;

public class Bid {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter bid amount of Michael:");
		System.out.println();
		int MichaelBidAmount = scn.nextInt();
		System.out.println("Enter bid amount of Bruce:");
		System.out.println();
		int BruceBidAmount = scn.nextInt();
		
		if(MichaelBidAmount > BruceBidAmount) System.out.println("Michael won the bid by "+(MichaelBidAmount-BruceBidAmount));
		else System.out.println("Bruce won the bid by "+(BruceBidAmount-MichaelBidAmount));
		
		scn.close();
	}
}
