package com.syntax.class15;

public class Task3 {
	
	void babyName(String mom, String dad, char gender) {
		if(gender=='f') {
			System.out.println(mom.substring(0,2)+dad.substring(3,6));
		}else if(gender=='m') {
			System.out.println(dad.substring(0,3)+mom.substring(2,4));
		}
	}
	public static void main(String[] args) {
		Task3 obj=new Task3();
		obj.babyName("Mary", "Daniel", 'f');
		obj.babyName("Mary", "Daniel", 'm');
		
System.out.println("--------------------------------");
//Asghars example

String father="Danilo";
String mother="Mariam";
String expectation="boy";
String firstPart="";
String secondPart="";
if (expectation.equalsIgnoreCase("boy")) {
	firstPart=father.substring(0,father.length()/2);
	secondPart=mother.substring(mother.length()/2);
}else if(expectation.equalsIgnoreCase("girl")) {
	firstPart=mother.substring(0,mother.length()/2);
	secondPart=father.substring(father.length()/2);
}
System.out.println(firstPart+secondPart);
	}

}
