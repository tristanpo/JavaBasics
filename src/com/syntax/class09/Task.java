package com.syntax.class09;

public class Task {

	public static void main(String[] args) {
		char[] grade=new char[6];
		grade[0]='A';
		grade[1]='B';
		grade[2]='C';
		grade[3]='D';
		grade[4]='E';
		grade[5]='F';
		
		System.out.println(grade[1]);
		
		char[] Grade;
		Grade=new char[6];
		Grade[0]='A';
		Grade[1]='B';
		Grade[2]='C';
		Grade[3]='D';
		Grade[4]='E';
		Grade[5]='F';
		
		System.out.println(Grade[1]);
		
		
		String[] name=new String[8];
		name[0]="Tristan";
		name[1]="Lily";
		name[2]="Dmitriy";
		name[3]="Moreed";
		name[4]="Francisco";
		name[5]="Shiva";
		name[6]="Reza";
		name[7]="Marina";
		System.out.println(name[0]);
		
		String[] Name;
		Name=new String[8];
		
		Name[0]="Tristan";
		Name[1]="Lily";
		Name[2]="Dmitriy";
		Name[3]="Moreed";
		Name[4]="Francisco";
		Name[5]="Shiva";
		Name[6]="Reza";
		Name[7]="Marina";
		System.out.println(Name[0]);
		
		String[] words=new String[5];
		words[0]="Java ";
		words[1]="Saturday ";
		words[2]="day ";
		words[3]="coding ";
		words[4]="is ";
		System.out.println(words[1]+words[4]+words[0]+words[3]+words[2]);
	}

}
