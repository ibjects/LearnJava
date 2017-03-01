package PublicPrivateProtected;

public class Oak extends Plant {
	//constructor
	public Oak() {
		
		name = "Oak Tree";
		//plantType = "Tree"; //won't work because private
		
		this.size = "large";
	}
}
