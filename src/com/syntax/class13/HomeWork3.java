package com.syntax.class13;

public class HomeWork3 {
	void ForeignGreeting(String country) {
		String hello=null;
		switch (country) {
		case "Germany":
				hello="Hallo";
				break;
		case "Russia":
				hello="Privet";
				break;
		case "USA":
				hello="Sup";
				break;
		}
		System.out.println(hello);
	}
	public static void main(String[] args) {
		HomeWork3 obj=new HomeWork3();
		obj.ForeignGreeting("USA");
		obj.ForeignGreeting("Russia");
		
		

	}

}
