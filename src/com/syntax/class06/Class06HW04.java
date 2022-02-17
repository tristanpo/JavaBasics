package com.syntax.class06;

import java.util.Scanner;

public class Class06HW04 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Is there a sale? Yes or No");
		String sale = input.next();

		if (sale.equalsIgnoreCase("No")) {
			System.out.println("You are not going shopping");
		} else if (sale.equalsIgnoreCase("Yes")) {
			System.out.println("What is the price of the item?");
		}

		int price = input.nextInt();
		double priceSale = 0;
		if (price < 20) {
			priceSale = price * .10;
		} else if (price > 20 && price <= 100) {
			priceSale = price * .20;
		} else if (price > 100 && price <= 500) {
			priceSale = price * .30;
		} else {
			priceSale = price * .50;
		}
		System.out.println("After discount " + priceSale + " the price of the item reduced from " + price + " to "
				+ (price - priceSale));
	}

}
