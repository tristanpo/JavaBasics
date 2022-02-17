package com.syntax.class06;

public class CleanExample {

	public static void main(String[] args) {
		
int num1=1000;
int num2=2000;
int num3=300;

int largest = 0;

if (num1>num2 && num1>num3) {
	System.out.println(num1+" is the largest");
	
	largest=num1;
		
	
}else if (num2>num1 && num2>num3) {
	System.out.println(num2+" is the largest");
	
	largest=num2;
		
	
}else if (num3>num1 && num3>num2) {
	System.out.println(num3+" is the largest");
	
	largest=num3;
}

System.out.println(largest);

if (largest%2==0) {
	System.out.println(largest+" is even number");
}else {
	System.out.println(largest+" is odd number");
}

	}
	}

