package org.view;

import java.util.Scanner;
import org.controller.Hospital;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void userDecision(int userChoice) {
		switch (userChoice) {
		case 1: {
			Hospital.opd();
			break;
		}
		case 2: {
			Hospital.billingCounter();
			break;
		}
		case 3: {
			Hospital.emergency();
			break;
		}
		case 4: {
			Hospital.test();
			break;
		}
		case 5: {
			Hospital.medicines();
			break;
		}
		default:
			System.out.println("Invalid input..");
		}
	}

	public static void main(String[] args) {
		String repeat = null;
		System.out.println("*********************** Welcome to QJ-Hospital ***********************");
		do {
			System.out.println("Please first provide the patient details :- ");
			Hospital.admission();
			System.out.println("Do you want to add more patient then type \"Yes\" or else press any other key");
			repeat = sc.next();
		} while (repeat.equalsIgnoreCase("yes"));

		String operationChoice = null;
		do {
			System.out.println("How may I help you ?");
			System.out.println("Press 1 for OPD");
			System.out.println("Press 2 for Billing");
			System.out.println("Press 3 for Emergency");
			System.out.println("Press 4 for Test");
			System.out.println("Press 5 for Medicines");

			int userChoice = sc.nextInt();
			userDecision(userChoice);
			System.out.println("Do you want to continue then type \"Yes\" or else press any other key");
			operationChoice = sc.next();
		} while (operationChoice.equals("yes"));
		System.out.println("Thank you visit again");
	}
}
