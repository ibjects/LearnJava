package com.ibjects.interfaces;

//extends use for inheritance
//implements keyword is used for interface

public class Machine implements Info {
	
	private int id = 7;
	
	public void start() {
		System.out.println("Machine Started");
	}

	
	//THIS IS A MUST USE METHOD BECAUSE THIS CLASS IMPLEMENTS INFO
	@Override
	public void showInfo() {
		System.out.println("MACHINE ID IS: " +  id);
	}
}
