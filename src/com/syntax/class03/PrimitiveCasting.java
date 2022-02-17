package com.syntax.class03;

public class PrimitiveCasting {

	public static void main(String[] args) {
	
		//main+ctrl+space
		//ctrl+space--> autocomplete
		
			int i=10;
			//widening or implicit
			//we store int value 10 inside variable
			double d=10;
			
			System.out.println(i);//10
			System.out.println(d);//10.0
			
			//int num=10.0;// Tpye mismatch: cannot convert from double to int
			/*casting 
			 * What- is a process of converting the value from one type to another
			 * we can cast primitive and non primitive
			 * 2 types of casting 
			 * widening / implicit/ automatic
			 * doulbe d=10;
			 * byte -> short -> int -> long -> float -> double
			 * narrowing/ explicit/ manual
			 * double -> float -> long -> int -> short -> byte
			 * int i=10.99 -> error:cannot comvert from double to int
			 * Why-
			 */
			//narrowing or explicit casting
			//we store double value 10.99 into int variable
			int num=(int)10.99;
			System.out.println(num);
			
			//float f=10.99;// Type mismatch: cannot convert from double to float
			float f=10.99f;
			byte b=(byte)1000;
			System.out.println(b);
			long numb=168768768699l;
			System.out.println(numb);
			//narrowing
			int number=(int)168768768699l;
			/*operators:
			 * assignment =
			 * arithmetical =, -, *, /, %
			 * relational and equality >,>=,<,<=,==,!=
			 */
			System.out.println(number);
			
			
		

	}

}
