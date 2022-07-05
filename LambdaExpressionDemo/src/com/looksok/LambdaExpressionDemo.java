package com.looksok;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpressionDemo {

	public static void main(String[] args) {
		System.out.println("\n-------- Lambda Expression Demo: looksok.wordpress.com --------\n");
		List<PersonInfo> persons = new ArrayList<PersonInfo>();
		persons.add(new PersonInfo("Jacek", "Milewski", "+48 123 456 789"));
		persons.add(new PersonInfo("John", "Doe", "+12 432 932 321"));
		persons.add(new PersonInfo("Chris", "Marks", "+23 325 526 444"));
		persons.add(new PersonInfo("Jan", "Kowalski", "+48 324 419 948"));
		
		printWithLambda(persons);
		printOldStyle(persons);
	}

	private static void printOldStyle(List<PersonInfo> persons) {
		for (PersonInfo personInfo : persons) {
			printPerson(personInfo, new PrintCondition() {
				
				@Override
				public boolean isSatisfied(PersonInfo personInfo) {
					return personInfo.getPhoneNumber().trim().startsWith("+48");
				}
			});
		}
	}

	private static void printWithLambda(List<PersonInfo> persons) {
		for (PersonInfo personInfo : persons) {
			printPerson(personInfo, 
					(PersonInfo personInfo) -> 
						personInfo.getPhoneNumber().trim().startsWith("+48"));
		}
	}
	
	private static void printPerson(PersonInfo personInfo, PrintCondition condition){
		if(condition.isSatisfied(personInfo))
			System.out.println(personInfo);
	}



}
