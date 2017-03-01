/*
 * toString is actually most useful when used in debugging
 * Because it'll give you a human understandable form of your object
 * */

class myFrog {
	
	private int id;
	private String name;
	
	public myFrog(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(id).append(" : ").append(name);
		
		//another way if you don't want to use string builder
		
		//return sb.toString();
		
		return String.format("%4d: %s",id, name);
	}
	
}
public class toStringMethod {

	public static void main(String[] args) {
		
		myFrog frog1 = new myFrog(12,"bob");
		
	//if you comment the toString method of myFrog Class
	//It'll print myFrog@14ae5a5 or something like that
	//myFrog is the class name and then @ sign
	//the number next to @ that looks 
	//like a memory address but it is Hash code
	//hash code in java is a unique identifier for all your objects
		System.out.println(frog1);
		

	}

}
