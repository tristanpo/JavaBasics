package com.syntax.class13;

public class MethodsDemo2 {

		void TeyfurAndHorse(String name,String animal) {
			if(name.equals("Teyfur")&&animal.equals("Horse")) {
				System.out.println("Camel");
			}else if(animal.equals("Horse")) {
				System.out.println("horse");
			}
			
		}
		public static void main(String[] args) {
			MethodsDemo2 obj=new MethodsDemo2();
			obj.TeyfurAndHorse("Teyfur", "Horse");
			obj.TeyfurAndHorse("tarik", "Horse");
		}
}
