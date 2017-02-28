class Machine {
	
	private String macName;
	private int code;
	
	//Constructor is a special method 
	//that runs everytime you create an instance of your class
	
	//constructor dosen't have a return type
	//the name of constructor should be the same name as of class
	
	
	//constructor
	public Machine() {
		System.out.println("Construtor 1 Running");
	}
	
	//init of instance variable is usually what 
	//constructor are used for
	
	public Machine(String macName) {
		
		//To call a constructor within another constructor
		//we use this keyword
		//but this has to be the first line
		
		this("Chumzee",98); //this is calling the third constructor as per parameters
		
		this.macName = macName;
		System.out.println("Construtor 2 Running");
	}
	
	public Machine(String macName, int code)
	{
		this.macName = macName;
		this.code = code;
		
		System.out.println("Construtor 3 Running");
	}
}


public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Machine mac1 = new Machine();
		Machine mac2 = new Machine("Macbook");
		Machine mac3 = new Machine ("iPad",543);

	}

}
