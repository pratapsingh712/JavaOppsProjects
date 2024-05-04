package collections.list.Demo;

import java.util.*;

public class OddEvenCount {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of your list :");
		int size = sc.nextInt();
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		System.out.println("Enter the elements in your list :");
		
		for(int i=0;i<size;i++)
		{
			Integer inp = sc.nextInt();
			al.add(inp);
		}
		
		System.out.println("Original list elements are : "+al);
		
		System.out.println("=================================================");
		
		int oddCount = 0,evenCount = 0;
		
		for(int i=0;i<al.size();i++)
		{
			if(al.get(i)%2==0)
			{
				evenCount++;
			}
			else
			{
				oddCount++;
			}
		}
		
		System.out.println("Odd count is "+oddCount);
		System.out.println("Even count is "+evenCount);
		
		sc.close();
		
	}
}
