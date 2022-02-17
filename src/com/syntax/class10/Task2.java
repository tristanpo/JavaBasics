package com.syntax.class10;

public class Task2 {

	public static void main(String[] args) {
		// create an array of countries. While retrieving all values from an array print
		//capital for each country.
		String[] country= {"USA","Russia","Germany","France"};
		String capital=null;
		
		for(int c=0; c<country.length; c++) {
			switch (country[c]){
			case "USA":
				capital="DC";
				break;
			case "Russia":
				capital="Moscow";
				break;
			case "Germany":
				capital="Berlin";
				break;
			case "France":
				capital="Paris";
				break;
			
				
			}
			System.out.println("The capital of the country "+country[c]+" is "+capital);
		}
		System.out.println("---------------------------------------");
		//Asel's example
		String[] countries = {"Poland", "Germany", "Ukraine","Russia", "Uk"};
		
		for (int i=0; i<countries.length; i++) {
			
			switch(countries[i]) {
			
			case "Poland":
				capital="Warsaw";
				break;
			case "Germany":
				capital="Berlin";
				break;
			case "Ukraine":
				capital="Kiev";
				break;
			case "Russia":
				capital="Moscow";
				break;
			case "UK":
				capital="London";
				break;
				
			
			}
			System.out.println("The capital of the country "+countries[i]+" is "+capital);
		}
		
		System.out.println("------ Another Way---------");
		
		for(String Country:countries) {
			
			if(Country.equals("Poland")) {
				capital="Warsaw";
			}else if (Country.equals("Geramny")) {
				capital="Berlin";
			}else if (Country.equals("Ukraine")) {
				capital="Kiev";
			}else if (Country.equals("Russia")) {
				capital="Moscow";
			}else if (Country.equals("UK")) {
				capital="London";
			}
			System.out.println("The capital of "+Country+" is "+capital);
		}
			
		
	}

}
