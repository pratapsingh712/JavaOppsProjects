package staticKeyWord;

public class staticDemo {

	int i = 1;
	static int j = 1;
	
	public void display() {
		
		System.out.println("beofre incrementing i = "+i+"\n and j = "+j);
		i++;
		j++;
		System.out.println("after incrementing i = "+i+"\n and j = "+j);
		
		System.out.println("-------------------------------------------------------");
	}
	
	static void print() {
		System.out.println("Static method :");
	}
	
	static {
		System.out.println("Static block :");
	}
}
