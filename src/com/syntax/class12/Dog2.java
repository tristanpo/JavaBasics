package com.syntax.class12;

public class Dog2 {
	String name;
	String color;
	String breed;
	char gender;
	int age;
	double weight;
	//behaviors/functions/methods
	void bark() {
		System.out.println("Dog is barking...");
	}
	
	void eat() {
		System.out.println("Dog is eating");
	}

	void sleep() {
		System.out.println("Dog is sleeping");
	}
	void printCompleteInfo() {
		System.out.println("name ="+name);
		System.out.println("breed ="+breed);
		System.out.println("age ="+age);
		System.out.println("weight ="+weight);
		System.out.println("color ="+color);
		System.out.println("gender ="+gender);
	}
	
		
	
	public static void main(String[] args) {
		Dog dog1=new Dog();
		dog1.name="Fido";
		dog1.color="White";
		dog1.breed="Husky";
		dog1.gender='M';
		dog1.age=5;
		dog1.weight=17.41;
		
		dog1.sleep();
		dog1.eat();
		dog1.bark();
		
		System.out.println("*******************");
		Dog dog2=new Dog();
		dog2.name="Brutus";
		dog2.color="brown";
		dog2.breed="Bulldog";
		dog2.gender='F';
		dog2.age=2;
		dog2.weight=10.45;
		
		dog2.sleep();
		dog2.eat();
		dog2.bark();
		System.out.println("******************");
		Dog dog3=new Dog();
		dog3.name="goldie";
		dog3.color="yellow";
		dog3.breed="Labrador";
		dog3.gender='M';
		dog3.age=8;
		dog3.weight=13.25;
		
		dog3.sleep();
		dog3.eat();
		dog3.bark();
	}

}
