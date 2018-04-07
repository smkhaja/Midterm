package Constructors;

public class Xyz {

	int address;
	String houseName;
	
		//Constructor 1
	public Xyz() {
		
	}

	//Constructor 2
	public Xyz(String houseName) {
		this.houseName = houseName;
		System.out.println(houseName);
	}  
	//Constructor 3
	public Xyz(String houseName, int address) {
		this.address = address;
		
		System.out.println(houseName +  " " +address);
		
	}
}
	