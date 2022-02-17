package com.syntax.class10;

public class Task2Continued {

	public static void main(String[] args) {
		String[] countries = {"Poland", "Germany", "Ukraine","Russia", "Uk"};
		String capital=null;
		for(String Country:countries) {
			
			if(Country.equals("Poland")) {
				capital="Warsaw";
			}else if (Country.equals("Germany")) {
				capital="Berlin";
			}else if (Country.equals("Ukraine")) {
				capital="Kiev";
			}else if (Country.equals("Russia")) {
				capital="Moscow";
			}else if (Country.equals("Uk")) {
				capital="London";
			}
			System.out.println("The capital of "+Country+" is "+capital);
		}
	}

}
