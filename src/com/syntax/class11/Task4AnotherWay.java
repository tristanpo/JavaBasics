package com.syntax.class11;

public class Task4AnotherWay {

	public static void main(String[] args) {
		int[][] array2D = { { 2, 3, 4 },
				{ 5, 6 }, 
				{ 12, 6, 8 } };
int sumEven=0;
int sumOdd=0;

for (int x = 0; x < array2D.length; x++) {

for (int y = 0; y < array2D[x].length; y++) {
	int element = array2D[x][y];
	if (element % 2 == 0) {
		sumEven+=element;
	}else {
		sumOdd+=element;
	}
}
}
System.out.println("Sum of Even numbers "+sumEven);
System.out.println("Sum of Odd numbers "+sumOdd);

	}

}
