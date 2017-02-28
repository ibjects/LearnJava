//a class is a template or blueprint for creating objects
//Everything in a real world are objects like me, cat, car etc
class Person {
	//Classes can contain
	// 1. Data
	// 2. Subroutines (Methods)
	
	//Instance Variables (Data or "State")
	
	String fullName;
	int age;
	
	//Let's make a Subroutine
	void printInformation() {
		System.out.println("Name: " + fullName + " Age: " + age);
	}
}


public class ClassesAndObjects {
	
	//Main is a method also called as subroutine
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//This is how you make a new person object
		Person john = new Person();
		
		john.fullName = "John Doe";
		john.age = 37;
		
		//calling the class method
		john.printInformation();
		
		Person sara = new Person();
		sara.fullName = "Sara Smith";
		sara.age = 20;
		
		System.out.println(sara.fullName);

	}

}
