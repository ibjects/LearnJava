class Frog {
	
	//Encapsulation meaning hiding data. 
	//So by using getter and setter we are hiding data
	//but right now name and age can be still called by the other classes
	//to avoid that to make data secret or just to be used by the same class
	//we put private keyword next to it
	
	private String name;
	private int age;
	
	//private is used to enforce encapsulation
	
	//getters
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	//setters
	public void setName(String newName)
	{
		name = newName;
	}
	
	//as you can see we we have declared newName string
	//what of it's the same name as our variable name
	
	public void setAge(int age)
	{
		this.age = age;
		//this means the instance variable the one declared above or the main one
	}
}

public class SetterAndThis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Frog frog1 = new Frog();
		
		//Because our variables are private in other class we can't access them
		//for this purpose we use getter and setters
		//frog1.name = "Chumzee";
		//frog1.age = 1;
		
		//setter
		frog1.setName("Bretie");
		//getter
		System.out.println(frog1.getName());
		
	}

}
