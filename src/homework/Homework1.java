package homework;

/*	BLOCK Comment
 * 	
 * public  - access identifier 
 * class   -  
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */
public class Homework1 {
	
	//constructor
	//non-default constructors
	public String name;
	//default constructor
	public Homework1() {
		
	}
	
	public Homework1(String name) {
		this.name = name;
	}
	
	//member variable - class variable
	
	//methods
	public static void main(String args[]) {
		Homework1 hw = new Homework1("abc");
		System.out.println(hw.name);
	}
}