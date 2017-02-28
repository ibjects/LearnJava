
class People
{
	String name;
	int age;
	
	//simple method
	void speak(){
		System.out.println("My name is "+name);
	}
	
	//return type method
	//void means nothing so change it to int so that method will return int
	int calculateYearToRetire()
	{
		int yearsLeft = 65 - age;
		return yearsLeft;
	}
	
	//Getter Methods
	
	int getAge()
	{
		return age;
	}
	
	String getName()
	{
		return name;
	}
	
	//method with parameters
	void say(String message) {
		System.out.println(message);
	}
	
	//method with paramters and return type
	int yearsLeftToRetire(int years) {
		return 65 - years;
	}
}


public class GetterAndReturnValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		People person1 = new People();
		
		person1.name = "John";
		person1.age = 25;
		
		int years = person1.calculateYearToRetire();
		System.out.println("Retirnment years Left: " + years);
		
		String name = person1.getName();
		System.out.println(name);
		
		person1.say("I'm long way from retiring");
		
		System.out.println(person1.yearsLeftToRetire(30));
		
	}

}
