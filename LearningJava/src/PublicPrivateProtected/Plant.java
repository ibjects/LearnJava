package PublicPrivateProtected;

public class Plant {
	
	//instance variable should not be public
	//it's a bad practice
	public String name;
	
	//Constants can be public static and final
	public final static int ID = 6;
	
	//private means you can only access it within this class
	private String plantType;
	
	//protected can be accessed in parent and child classes and also in the same package
	protected String size;
	
	//if you don't give any PPP to a variable
	//It'll work but only for classes in the same package
	//it has package level visibility
	//it won't work if it is not in the same package
	//even if it's a sub class it won't work
	int height;
	
	public Plant() {
		this.name = "Freddy";
		this.plantType = "Tree";
		this.size = "Small";
	}

}
