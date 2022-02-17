package com.syntax.class02;

public class CreatingVariables {

	public static void main(String[] args) {
		/* create a variable and assign value
		 * 
		 * declare a variable and initialize
		 */
		//1
		int age=25;
		
		//2 
		int num; //declare variable
		num=10;  //initialize it
		num=100; // reassign the value	
		int n1,n2,n3; //all 3 variables are on the int type
		
		n1=10;
		n2=20;
		n3=30;
		
		//cmd+d-->will remove entire line
		//ctrl+d--> will remove entire line
		
		//can I change a value of the variable?
		
		age=26; //reassigning the value of variable age
		//age=26.5; ERROR: age variable can only hold int value
		age =57;
		age =75;
		System.out.println(age);
		
		age= 100;
		
		// java rules for identifiers 
		
		//boolean break=false; ERROR--> do not use keyword as identifier 
		
		//char 1character='A'; ERROR--> do not start identifier with numbers
		// or special characters
		
		//double %value=12.99;
		
		//Java allows to use _ OR $ as identifier 
		double $price=1.99;
		double _value=2.99;
		
		char character1='a';
		
		boolean Break=true; //keywords are case sensitive
		//not rules, but we prefer to follow
		
		/* variables and methods names should start with lowercase
		 * give variable a meaningful name
		 * class name should start with upper case 
		 * if name has 2 or more words---> follow camel casing and no spaces
		 */
		int BigNumber=13245;
	
	}

}
