class Thing {
	public String myName;
	
	// to make a variable static just add it before the type
	public static String description;
	
	//Static variables are created already meaning you don't need to
	//init them in order to work with them they are already there and you
	//can call them simply by class name dot variable
	
	public void showN()
	{
		System.out.println(myName);
	}
	
	public static int count = 0;
	
	public int id;
	
	public Thing()
	{
		id = count;
		count++;
	}
	
	public static void showInfor()
	{
		System.out.println("Hello");
		
		//Instance methods can access the static data
		//but the static methods cannot access the instance variables data
		//because static are already init and instance variables need 
		//to be init so static
	}
	
	
	///////////Constant Variables\\\\\\\\\\\\\\\\
	//constants are always written in uppercase
	//to make it constant just add final keyword
	
	public final static int LUCKY_NUM = 7; //you need to assign it as you declare
}
public class StaticAndFinal {

	public static void main(String[] args) {
		
		System.out.println("Before: " + Thing.count);
		
		Thing thing1 = new Thing();
		Thing thing2 = new Thing();
		
		thing1.myName = "Bob";
		thing2.myName = "Sue";
		
		System.out.println(thing1.myName);
		System.out.println(thing1.myName);
		
		//Static variable dosen't get their on instance variable
		//they are called by the class name
		
		Thing.description = "This is a thing";
		
		System.out.println(Thing.description);
		
		
		//calling static method
		Thing.showInfor();
		
		System.out.println(Thing.LUCKY_NUM);
		
		System.out.println("After: " + Thing.count);
	}

}
