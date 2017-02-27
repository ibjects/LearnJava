import java.util.Scanner;

public class Loops {

	private static Scanner inputNumber;

	public static void main(String[] args) {
		// We saw this way of declaring a boolean in HelloWorld.java
		boolean myBool = true;
		
		//otherWays
		boolean newBoolOne = 3 < 4; //this will set myBool true
		boolean newBoolTwo = 5 < 1; // this will set myBool false
		
		System.out.println(myBool);
		System.out.println(newBoolOne);
		System.out.println(newBoolTwo);
		
		//while loop
		int num = 10;
		boolean newBoolThree = num < 20;
		
		while(newBoolThree)
		{
			//print the value of boolean
			System.out.println("Values is " + newBoolThree);
			//incrementing one in the condition to avoid infinite loop
			num = num+1;
			
			//assigning the new condition to boolean
			newBoolThree = num < 20;
			
		}
		
		inputNumber = new Scanner(System.in);
		int value;
		
		do {
			
			System.out.println("Enter a number: ");
			value  = inputNumber.nextInt();
			
		}while(value!=5);
		
		System.out.println("Got 5!");
		
		
		//for loop
		for(int i = 0; i < 5; i++)
		{
			System.out.println("Hello " + i);
			
			//another way of printing
			System.out.printf("Hello %d\n", i);
		}
		
	}

}
