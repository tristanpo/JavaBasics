package com.syntax.class05;

public class LogicalOr {

	public static void main(String[] args) {
		String day="Monday";
		if (day.equals("Saturday") || day.equals("Sunday")) {
			System.out.println("I have java class");
		}
System.out.println("Code outside of if statement");
	/*Let's ask user what is today
	 * 
	 * based on the day lets define which class we have
	 * if (monday or friday)---> there is no class today
	 * else if (tuesday or wednesday)--> manual
	 * els if (thursday)-->review class
	 * else if (saturday or sunday)--> java class
	 */
	}

}
