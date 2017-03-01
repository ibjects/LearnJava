package com.ibjects.interfaces;

public class App {

	public static void main(String[] args) {
		
		Machine mac1 = new Machine();
		mac1.start();
		
		Person per1 = new Person("John");
		per1.greet();
		
		//Using an interface
		
		Info info1 = new Machine(); //this is allowed because machine implements it
		info1.showInfo();
		
		Info info2 = per1;
		info2.showInfo();
		
		myMethod(info2);
	}
	
	private static void myMethod(Info info) {
		info.showInfo();
	}

}
