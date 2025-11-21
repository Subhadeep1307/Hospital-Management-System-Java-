package org.controller;

import java.util.ArrayList;
import java.util.Scanner;

import org.model.InsufficientFundsException;
import org.model.Patient;

public class Hospital {
	// scanner object to access it throughout the class :
	static Scanner sc = new Scanner(System.in);
	// to store all the patient details
	static ArrayList<Patient> al = new ArrayList<Patient>();

	// Admission method to admit the patient
	public static void admission() {
		System.out.println("Provide your bank balance : ");
		double amount = sc.nextDouble();
		sc.nextLine();
		System.out.println("Provide your name : ");
		String name = sc.nextLine();
		System.out.println("Provide your age : ");
		int age = sc.nextInt();
		System.out.println("Provide your phone number : ");
		long phone = sc.nextLong();
		sc.nextLine();
		System.out.println("Provide your address : ");
		String address = sc.nextLine();
		System.out.println("Provide your gender : ");
		char gender = sc.next().charAt(0);

		boolean added = al.add(new Patient(amount, name, age, phone, address, gender));
		System.out.println(added ? "Patient Admitted" : "Not admitted");
	}

	// to check the patient is registered or not
	public static Patient checkPhone(long phone) {
		for (Patient p : al) {
			if (p.getPhone() == phone) {
				return p;
			}
		}
		return null;
	}

	// for emergency cases of patients
	public static void emergency() {
		System.out.println("Provide your registered mobile number : ");
		long phone = sc.nextLong();
		Patient p = checkPhone(phone);

		if (p != null) {
			System.out.println("What emergency do you have ?");
			System.out.println("Press 1 for Orthopedic");
			System.out.println("Press 2 for Cardiologist");

			int emergencyChoice = sc.nextInt();
			switch (emergencyChoice) {
			case 1: {
				emergencyOrtho(p);
				break;
			}
			case 2: {
				emergencyCardio(p);
				break;
			}
			default:
				System.out.println("Invalid choice..");
			}
		} else {
			System.out.println("Invalid mobile number");
			emergency();
		}
	}

	// for emergency treatment of ortho patient
	public static void emergencyOrtho(Patient p) {
		System.out.println("Please bring the patient : " + p.getName());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

		}
		System.out.println("Operation successful : ");
	}

	// for emergency treatment of cardio patient
	public static void emergencyCardio(Patient p) {
		System.out.println("Please bring the patient : " + p.getName());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

		}
		System.out.println("Operation successful : ");
	}

	// OPD Theater
	public static void opd() {
		System.out.println("Provide your registered mobile number : ");
		long phone = sc.nextLong();
		Patient p = checkPhone(phone);

		if (p != null) {
			System.out.println("Which doctor you want to visit ?");
			System.out.println("Press 1 for Medicine Specialist");
			System.out.println("Press 2 for Orthopedic");
			System.out.println("Press 3 for Cardiologist");
			System.out.println("Press 4 for Neurologist");

			int opdChoice = sc.nextInt();
			switch (opdChoice) {
			case 1: {
				medicineSpecialist(p);
				break;
			}
			case 2: {
				orthopedic(p);
				break;
			}
			case 3: {
				cardiologist(p);
				break;
			}
			case 4: {
				neurologist(p);
				break;
			}
			default:
				System.out.println("Invalid choice..");
			}
		} else {
			System.out.println("Invalid mobile number");
			opd();
		}
	}

	// Medicine specialist doctor method
	public static void medicineSpecialist(Patient p) {
		System.out.println("Bring the patient: " + p.getName());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

		}
		System.out.println("Treatment done have medicines regularly");
	}

	// Orthopedic doctor method
	public static void orthopedic(Patient p) {
		System.out.println("Bring the patient: " + p.getName());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

		}
		System.out.println("Treatment done have medicines regularly");
	}

	// Cardiologist doctor method
	public static void cardiologist(Patient p) {
		System.out.println("Bring the patient: " + p.getName());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

		}
		System.out.println("Treatment done have medicines regularly");
	}

	// Neurologist doctor method
	public static void neurologist(Patient p) {
		System.out.println("Bring the patient: " + p.getName());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

		}
		System.out.println("Treatment done have medicines regularly");
	}

	// billing desk method
	public static void billingCounter() {
		System.out.println("Provide your registered mobile number : ");
		long phone = sc.nextLong();
		Patient p = checkPhone(phone);
		if (p != null) {
			System.out.println("Please choose your mode of payment");
			System.out.println("Press 1 for Cash");
			System.out.println("Press 2 for UPI");
			System.out.println("Press 3 for Credit/Debit Card");
			System.out.println("Press 4 for Cheque");

			int paymentOption = sc.nextInt();
			switch (paymentOption) {

			case 1: {
				cash(p);
				break;
			}
			case 2: {
				upi(p);
				break;
			}
			case 3: {
				cardPayment(p);
				break;
			}
			case 4: {
				cheque(p);
				break;
			}
			default:
				System.out.println("Invalid choice..");
			}
		} else {
			System.out.println("Invalid mobile number");
			billingCounter();
		}
	}

	// method for cash payment
	public static void cash(Patient p) {
		System.out.println("Please provide the amount");
		double billAmount = sc.nextDouble();
		if (p.getAmount() < billAmount) {
			try {
				throw new InsufficientFundsException("The amount in your bank account is not sufficient");
			} catch (InsufficientFundsException e) {
				e.printStackTrace();
			}
		} else
			System.out.println("Payment done successfully");
	}

	// method for UPI payment
	public static void upi(Patient p) {
		System.out.println("Please provide the amount");
		double billAmount = sc.nextDouble();
		if (p.getAmount() < billAmount) {
			try {
				throw new InsufficientFundsException("The amount in your bank account is not sufficient");
			} catch (InsufficientFundsException e) {
				e.printStackTrace();
			}
		} else
			System.out.println("Payment done successfully");
	}

	// method for card payment
	public static void cardPayment(Patient p) {
		System.out.println("Please provide the amount");
		double billAmount = sc.nextDouble();
		if (p.getAmount() < billAmount) {
			try {
				throw new InsufficientFundsException("The amount in your bank account is not sufficient");
			} catch (InsufficientFundsException e) {
				e.printStackTrace();
			}
		} else
			System.out.println("Payment done successfully");
	}

	// method for cheque payment
	public static void cheque(Patient p) {
		System.out.println("Please provide the amount");
		System.out.println("Payment processing...");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

		}
		double billAmount = sc.nextDouble();
		if (p.getAmount() < billAmount) {
			try {
				throw new InsufficientFundsException("The amount in your bank account is not sufficient");
			} catch (InsufficientFundsException e) {
				e.printStackTrace();
			}
		} else
			System.out.println("Payment done successfully");
	}

	// method to perform the tests
	public static void test() {
		System.out.println("Provide your registered mobile number : ");
		long phone = sc.nextLong();
		Patient p = checkPhone(phone);

		if (p != null) {
			System.out.println("Please provide the sample : ");
			String sample = sc.next();
			if (sample.equalsIgnoreCase("urine"))
				System.out.println("Urine sample received");
			else if (sample.equalsIgnoreCase("blood"))
				System.out.println("Blood sample received");
			else if (sample.equalsIgnoreCase("Stool"))
				System.out.println("Stool sample received");
			else if (sample.equalsIgnoreCase("Hair"))
				System.out.println("Hair sample received");
		} else {
			System.out.println("Invalid mobile number");
			test();
		}
	}

	// method to take medicines
	public static void medicines() {
		System.out.println("Provide your registered mobile number : ");
		long phone = sc.nextLong();
		Patient p = checkPhone(phone);

		if (p != null) {
			System.out.println("Specify your disease : ");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {

			}
			System.out.println("Medicines provided");
		} else {
			System.out.println("Invalid mobile number");
			medicines();
		}
	}
}
