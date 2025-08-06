package edu.basic;

import edu.demo.Cat;

public class MyMain {
	
	String name;
	int number;
	static int age;
	

	
	public static void main(String arg[]) {
	 MyMain m1 = new MyMain();

	}

	public String getName() {
		System.out.print("How are you");
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	 {
        System.out.println("Non Static block is executed.");
        number = 42; // initializing static variable
    }
	 
	 static {
	        System.out.println("Static block is executed.");
	        age = 42; // initializing static variable
	    }
		public   MyMain() {
			System.out.print("Hello");
		}
}



