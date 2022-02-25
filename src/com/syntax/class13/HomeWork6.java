package com.syntax.class13;

public class HomeWork6 {
char getGrade(int score) {
	if (score>90) {
		return 'A';
	}else if (score>80) {
		return 'B';
	}else if (score>70) {
		return 'C';
	}else if (score>50) {
		return 'D';
	}else {
		return 'F';
	}
}
	public static void main(String[] args) {
		HomeWork6 student=new HomeWork6();
		char grade=student.getGrade(90);
		System.out.println(grade);

	}

}
