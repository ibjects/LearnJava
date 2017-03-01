
//extends is the keyword used for inheritance in Java
//This class has parent class MyMachine
//which means it'll use all the methods in my machine

public class Car extends MyMachine {
	
	public void wipeWindShield() {
		System.out.println("Wiping windshield");
	}
	
	//overriding method in parent class
	//@Override is used above the method you want to override
	
	@Override
	public void start() {
		System.out.println("Car Started");
	}
	
	public void showInfo()
	{
		System.out.println("Car Name: " + macName);
	}
	
}
