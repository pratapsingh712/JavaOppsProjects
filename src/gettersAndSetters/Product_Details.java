package gettersAndSetters;

import java.util.Scanner;

public class Product_Details {

	public static void main(String[] args) {
		
		EncapsulProduct p1 = new EncapsulProduct("Sony Headset",11999,1);
		EncapsulProduct p2 = new EncapsulProduct("Stocks",121000,1);
		EncapsulProduct p3 = new EncapsulProduct("Hp Monitor",11000,1);
		
		// i can also use getters and setters method to 
		// get and set value for my objects 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the product name you want to search :");
		String name = sc.nextLine();
		
		System.out.println(name+" is available in table 1: "+p1.isAvailable(name));
		System.out.println(name+" is available in table 2: "+p2.isAvailable(name));
		System.out.println(name+" is available in table 3: "+p3.isAvailable(name));
		
		System.out.println("=====================================================");
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		
		sc.close();
		
	}
}
