package com.syntax.class13;

public class MethodsDemo3 {
	//int we specify the datatype that method will return
	//squareTheNumber name of the method
	//(int number) parameter of the method
	//return tell java what to return from this method
	int squareTheNumber(int number) {
		return number*number;
	}
	
	int returnTheSameNumber(int number) {
		return number;
	}
	
	String nameAnimal(String name,String animal) {
		if(name.equalsIgnoreCase("Teyfur")&&animal.equalsIgnoreCase("Horse")) {
			return "Camel";
		}else if (animal.equalsIgnoreCase("Horse")) {
			return "Horse";
		}else {
			return "Unknown";
		}
	}
	//create a method that takes a person name and an animal name
	//if person name is "Teyfur" and if animal is "Horse" it returns us "Camel"
	public static void main(String[] args) {
		MethodsDemo3 obj=new MethodsDemo3();//object creation
		int result=obj.squareTheNumber(5);
		System.out.println(result);
		System.out.println(obj.nameAnimal("teyfur", "Horse"));
		System.out.println(obj.nameAnimal("teyfur", "camel"));
		System.out.println(obj.nameAnimal("Aizhan", "Horse"));
	}

}
