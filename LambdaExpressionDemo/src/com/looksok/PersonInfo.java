package com.looksok;


public class PersonInfo {

	private String name;
	private String surname;
	private String phoneNumber;

	public PersonInfo(String name, String surname, String phoneNumber) {
		super();
		this.name = name;
		this.surname = surname;
		this.phoneNumber = phoneNumber;
	}

	public String toString() {
		return "PersonInfo:" +
				"\nName: " + name + 
				"\nSurname=" + surname + 
				"\nPhone number=" + phoneNumber;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	

}
