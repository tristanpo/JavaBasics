package com.syntax.class13;

public class HomeWork5 {
	void PrimeOrNot(int x) {
		if (x>1) {
			if(x>=2&&x%2!=0) {
				System.out.println("Number is prime");
			}else {
				System.out.println("Number is not prime");
			}
		}
		}
			
		
	public static void main(String[] args) {
		HomeWork5 obj=new HomeWork5();
		obj.PrimeOrNot(7);

	}

}
