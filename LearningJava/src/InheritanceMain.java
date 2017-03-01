//This inheritance example is using MyMachine and Car Class


public class InheritanceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyMachine mac1 = new MyMachine();
		
		mac1.start();
		mac1.stop();
		
		System.out.println(mac1.macName);
		
		//because MyMachine is the parent of Car
		//we can access it's methods
		Car car1 = new Car();
		car1.start();
		car1.wipeWindShield();
		car1.stop();
		
		car1.showInfo();
		
	}

}
