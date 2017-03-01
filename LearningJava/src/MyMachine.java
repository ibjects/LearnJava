
public class MyMachine {
	
	
	//Using protected keyword means that you can use it in
	//this package and in all the child classes
	
	protected String macName = "Machine Type 1";
	
	public void start() {
		System.out.println("Machine Started");
	}
	
	public void stop() {
		System.out.println("Machine Stopped");
	}

}
