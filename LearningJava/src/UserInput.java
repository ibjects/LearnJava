//To get input you need to import the class required 
import java.util.Scanner;


public class UserInput {

	private static Scanner userInput;

	public static void main(String[] args) {
		
		userInput = new Scanner(System.in);
		
		System.out.println("Type a sentence: ");
		
		//wait for the user to enter a line of text
		String userLine = userInput.nextLine();
		
		System.out.println("You Entered: "+ userLine);	
		
		// to get an int value
		System.out.println("Enter an int value: ");
		
		int userInt = userInput.nextInt();
		System.out.println("You Entered: "+ userInt);	
		
	}

}
