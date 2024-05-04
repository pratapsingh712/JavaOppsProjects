package collections.list.Demo;

import java.util.ArrayList;
import java.util.Scanner;

public class EvenElements {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of your array list :");
		int size = sc.nextInt();
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for(int i=0;i<size;i++)
		{
			Integer inp = sc.nextInt();
			al.add(inp);
		}
		
		System.out.println("Original List elements are = "+al);
		
		System.out.println("===================================================");
		
		System.out.print("Even elements in our list are : ");
		
		for(int i=0;i<al.size();i++)
		{
			if(al.get(i)%2==0)
			{
				System.out.print(al.get(i)+" ");
			}
		}
		
		sc.close();
	}
}
