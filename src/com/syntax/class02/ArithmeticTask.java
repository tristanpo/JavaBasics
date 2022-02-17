package com.syntax.class02;

public class ArithmeticTask {

	public static void main(String[] args) {
		double n1 = 3.6;
		double n2 = 10.5;
		double add = n1 + n2;
		double sub = n1 - n2;
		double div = n1 / n2;
		double mult = n1 * n2;
		System.out.println("The sum of 2 numbers " + n1 + " and " + n2 + " is equal to " + add);
		System.out.println("The difference of 2 numbers " + n1 + " and " + n2 + " is equal to " + sub);
		System.out.println("The quotient of 2 numbers " + n1 + " and " + n2 + " is equal to " + div);
		System.out.println("The product of 2 numbers " + n1 + " and " + n2 + " is equal to " + mult);

		double d1 = 3.9;
		double square = d1 * d1;
		System.out.println("The Square of the number 3.9 is " + square);

		int width = 5;
		int height = 8;
		int perimeter = width + width + height + height;
		int area = width * height;
		System.out.println("The Perimeter of a rectangle with width " + width + " and height " + height
				+ " is equal to " + perimeter + " and the area is " + area);

		// Shortcut to format code= ctrl+shift+f
	}

}
