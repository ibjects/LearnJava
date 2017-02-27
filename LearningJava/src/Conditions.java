
import java.util.Scanner;

public class Conditions {

	private static Scanner inValue;

	public static void main(String[] args) {
		
		//Equal to ==
		//Not Equal to !=
		//Greater than or equal to >=
		//Less than or equal to <=
		//AND &&
		//OR ||
		
		
		//if condition
		int num = 15;
		
		if(num < 10)
		{
			System.out.println("Number is less than 10");
		}
		else if(num > 10)
		{
			System.out.println("Number is greater than 10");
		}
		else
		{
			System.out.println("No condition from above is valid");
		}
		//Else is used to concatenate if conditions. 
		//It is also used to give a default condition if 
		//none of the condition is true.
		
		//if conditions with while loop
		
		int newInt = 0;
		
		while(newInt <= 30)
		{
			if(newInt/5==0)
			{
				System.out.println("Number is Divisible by 5");
			}
			newInt++;
		}
		
		//switch condition
		System.out.printf("Enter a command: ");
		
		inValue = new Scanner(System.in);
		String value = inValue.nextLine();
		
		switch(value)
		{
		case "start":
			System.out.println("Machine Started");
			break;
		case "stop":
			System.out.println("Machine Stopped");
			break;
		default:
			System.out.printf("Command not found");
		}
		
	}

}
