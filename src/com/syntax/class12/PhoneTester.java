package com.syntax.class12;

public class PhoneTester {

	public static void main(String[] args) {
		AsgharPhone pixel=new AsgharPhone();
		pixel.make="apple";
		pixel.model="pixel 13";
		pixel.noOfCams=3;
		pixel.color="blue";
		pixel.screenSize=6.8;
		pixel.os="Android 12";
		pixel.phonenumber="1234567890";
		pixel.makeCall();
		pixel.takePictures();
		pixel.printCompleteInfo();
	}

}
