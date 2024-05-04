package collections.set.demo;

import java.util.Scanner;

import java.util.TreeSet;

public class EvenElements {

	public static void main(String[] args) {
		
		// to follow the insertion order i can use linkedHashSet
		// to store in ascending order i can use tree set 
		// to store in uordered manner i can use hashset 
		
		TreeSet<Integer> ts = new TreeSet<Integer>();
		
		System.out.println("Enter the size :");
	
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		System.out.println("Enter the elements :");
		
		for(int i=0;i<size;i++)
		{
			ts.add(sc.nextInt());
		}
		
		System.out.println("Tree set = "+ts);
		
		System.out.println("=====================================");
		
		System.out.print("Even elements in your list are : ");
		
		for(Integer ele : ts)
		{
			if(ele%2==0)
			{
				System.out.print(ele+" ");
			}
		}
		
		sc.close();
		
	}
}
