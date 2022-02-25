package com.syntax.class12;

public class Phone {
String name;
String brand;
int price;

void ring() {
	System.out.println(name+" is ringing");
}
void lockscreen() {
	System.out.println(name+" is locked");
}
void printCompleteInfo() {
	System.out.println("name ="+name);
	System.out.println("brand ="+brand);
	System.out.println("price ="+price);
}
	public static void main(String[] args) {
		Phone iphone=new Phone();
		iphone.name="Iphone";
		iphone.brand="Apple";
		iphone.price=999;
		iphone.printCompleteInfo();
		System.out.println("***************");
		Phone pixel=new Phone();
		pixel.name="Pixel";
		pixel.brand="Google";
		pixel.price=599;
		pixel.printCompleteInfo();
		System.out.println("****************");
		Phone nokia=new Phone();
		nokia.name="Nokia";
		nokia.brand="Nokia Corporation";
		nokia.price=699;
		nokia.printCompleteInfo();
		
		iphone.ring();
		nokia.lockscreen();
			

	}

}
