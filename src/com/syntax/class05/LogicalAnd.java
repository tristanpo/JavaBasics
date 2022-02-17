package com.syntax.class05;

public class LogicalAnd {

	public static void main(String[] args) {
		//to debug->slow execution
		//1.Must put breakpoint from anyline you want to debug your code
		//click on step over
		/*To test multiple conditions in 1 statement?
		 * yes --> using logical operators
		 * AND &&
		 * True && True=true
		 * false && true=false
		 * true && false=false
		 * False && false=false
		 * OR ||
		 * true || true--> true
		 * true || false--> true
		 * false || true--> true
		 * false || false--> false
		 * NOT!
		 * 
		 */
		boolean practice=true;
		boolean likeJava=true;
		boolean understandJava=true;
		
		if (likeJava && understandJava && practice)
		{
			System.out.println("This is best combination");
		}
		System.out.println("End of the code");
		//We want to compare 3 numbers
		/*num1 > num2 && num1 > num3 --> num1 is the largest
		 * what if num2>num1&&num2>num3 --> num2 is the largest
		 * what if num3>num1 && num3>num2 --> num3 is the largest
		 * 
		 */
		
		int num1=10;
		int num2=20;
		int num3=30;
		
		if (num1>num2 && num1>num3) {
			
		}
	}

}
