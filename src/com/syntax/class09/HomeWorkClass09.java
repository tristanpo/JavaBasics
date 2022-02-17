package com.syntax.class09;

public class HomeWorkClass09 {
public static void main(String[] args) {
	String[] cars=new String[6];
	cars[0]="BMW";
	cars[1]="Audi";
	cars[2]="Porsche";
	cars[3]="Mercedes";
	cars[4]="Volkswagen";
	cars[5]="Opel";
	
	for (String make:cars) {
		System.out.println(make);
	}
	System.out.println("------------------");
	for (int i=0; i<cars.length; i++) {
		System.out.println(cars[i]+" ");
	}
	
	
}
}
