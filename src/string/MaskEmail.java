package string;

import java.util.Scanner;

public class MaskEmail {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the email address :");
		String email = sc.nextLine();
		
		// to mask from sec index until before @ 
		int startIndex = 2;
		int endIndex = email.indexOf('@');
		
		// taking the substring and making all xx 
		
		String masked = "";
		
		for(int i=0;i<endIndex-startIndex;i++)
		{
			masked += "x";
		}
		
		String firstPart = email.substring(0, 2);
		String lastPart = email.substring(endIndex,email.length());
		
		String result = firstPart+masked+lastPart;
		
		System.out.println("After masking the email i get : "+result);
		
		sc.close();
		
		
	}
}
