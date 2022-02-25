package com.syntax.class13;

public class HomeWork {
	void WhichIsLarger(int a, int b) {
		if(a>b) {
			System.out.println(a+" is larger");
		}else if(a<b) {
			System.out.println(b+" is larger");
		}
		
	}
	public static void main(String[] args) {
		HomeWork obj=new HomeWork();
		obj.WhichIsLarger(5,3);
		}

}
