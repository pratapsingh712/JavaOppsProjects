package collections.list.Demo;

import java.util.*;

public class Demo {

	public static void main(String[] args) {
		
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		
		al1.add(15);
		al1.add(55);
		al1.add(65);
		al1.add(25);
		al1.add(75);
		al1.add(95);
		al1.add(15);
		al1.add(2,33); // add 33 at index 2 and right shift other ele
		al1.set(4,44); // overwrite the element at 4th index with 44
		
		
		System.out.println(al1);
		
		int i = 0;
		
		//System.out.println(al1.get(i - 1) + 1);
		System.out.println("====================================");
		System.out.println("value present in 5th index "+al1.get(5));
		System.out.println("Value 143 is present or not in array list al1 "+al1.contains(143));
		System.out.println("First Occurence of element 15 "+al1.indexOf(15));
		System.out.println("Last Occurence of element 15 "+al1.lastIndexOf(15));
		System.out.println("Total size of our array list is :"+al1.size());
		
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("Apple");
		al2.add("45");
		
		al2.add(0,"22"); // will shift the element at index 0 to next element and then add 22 at index 0
		
		System.out.println(al2);
		
		LinkedList<Float> ll1 = new LinkedList<Float>();
		ll1.add(1.3f);
		ll1.add(2.35f);
		ll1.add(6.3f);
		//15, 55, 33, 65, 25, 75, 95, 85
		
		
		// i am going to add all element at index 0 and lets see what happens 
		
		ll1.add(0,11.12f);
		ll1.add(0,12.12f);
		ll1.add(0,13.12f);
		
		System.out.println(ll1);
	}
}
