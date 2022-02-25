package com.syntax.class12;

public class AsgharPhone {
	
	String make;
	String model;
	int noOfCams;
	String color;
	double screenSize;
	String os;
	String phonenumber;
	
	void makeCall() {
		System.out.println("Making a call");
	}
	
	void takePictures() {
		System.out.println("Taking pictures ");
	}
	void printCompleteInfo() {
		System.out.println("make "+make);
		System.out.println("model "+model);
		System.out.println("noOfCams "+noOfCams);
		System.out.println("color "+color);
		System.out.println("screensize "+screenSize);
		System.out.println("os "+os);
		System.out.println("PhoneNumber "+phonenumber);
	}
	public static void main(String[] args) {
		
		AsgharPhone iphone=new AsgharPhone();
		iphone.make="apple";
		iphone.model="Iphone 13";
		iphone.noOfCams=3;
		iphone.color="blue";
		iphone.screenSize=6.8;
		iphone.os="IOS";
		iphone.makeCall();
		iphone.takePictures();
		
		iphone.printCompleteInfo();
		AsgharPhone samsung=new AsgharPhone();
		
	}

}
