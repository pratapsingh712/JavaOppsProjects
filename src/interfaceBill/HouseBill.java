package interfaceBill;

import java.util.Scanner;

public class HouseBill {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the units used for electricy bill then water bill ");
		int eUnit = sc.nextInt();
		int wUnit = sc.nextInt();
		
		Wbill wb = new Wbill(wUnit);
		Ebill eb = new Ebill(eUnit);
		
		System.out.println(wb.toString());
		System.out.println(eb.toString());

		Wbill wb1 = new Wbill(45);
		Ebill eb1 = new Ebill(55);
		
		System.out.println(wb1.toString());
		System.out.println(eb1.toString());
		
		sc.close();
		
		// other alternative could be using the switch case with options also taking more details in wbill and ebill classes
		// like house number, user name, etc.
		
	}

}
