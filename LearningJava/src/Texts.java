
public class Texts {

	public static void main(String[] args) {
		
		//initialize and allocate three strings
		String myText = "Hello";
		String singleSpace = " ";
		String name = "John";
		
		//initialize and allocate a new string which will concatenate
		String greetPerson = myText + singleSpace + name;
		
		//printing the result
		System.out.println(greetPerson);
		
		//Another way of printing the same result
		System.out.println("Hello" + " " + name);
		
		//here is how to concatenate other types with String
		int num = 7;
		
		System.out.println("Hello " + name + " your lucky number is: " + num);
		
		
	}

}
