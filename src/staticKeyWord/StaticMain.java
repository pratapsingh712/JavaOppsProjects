package staticKeyWord;

public class StaticMain {

	public static void main(String[] args) {
		
		staticDemo d1 = new staticDemo();
		d1.display();
		
		staticDemo d2 = new staticDemo();
		d2.display();
		
		staticDemo.print(); // i can call static method from direct class name also and from any object created also 
		
		
	}
}
