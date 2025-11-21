package org.model;

public class Patient {
	private double amount;
	private String name;
	private int age;
	private long phone;
	private String address;
	private char gender;

	public Patient(double amount, String name, int age, long phone, String address, char gender) {
		this.amount = amount;
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.address = address;
		this.gender = gender;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
}
