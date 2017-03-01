package poly;

public class App {

	public static void main(String[] args) {
	
		//Polymorphism means many shapes
		//if u have a child class 
		//you can always use a child class where you can use a parent class
		
		Plant plant1 = new Plant();
		Tree tree = new Tree();
		
		Plant plant2 = tree;
		
		plant2.grow();
		//plant2.shedLeaves(); //will not work
		
		tree.shedLeaves();
	}

}
