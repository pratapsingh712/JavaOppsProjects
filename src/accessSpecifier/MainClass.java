package accessSpecifier;

public class MainClass {

	public static void main(String[] args) {

		Demo d = new Demo();
		
		d.i = 10;  // public
		
		d.display();
		
		//d.j = 45; // private
		
		// for commit operation
		
		d.k = 55; // protected 
		
		d.g = 90; // default
		
	}
}
