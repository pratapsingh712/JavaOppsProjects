package IteratorInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		
		// i am going to use set collection for iterator demo 
		
		/*Comparator<Integer> com = new Comparator<Integer>()
		{

			
			public int compare(Integer first, Integer second) {
				
				if(first%10 > second%10)
				return 1;
				
				else
				return -1;
			}
		};*/
		
		ArrayList<Integer> arrlist = new ArrayList<>();
		
		arrlist.add(17);
		arrlist.add(24);
		arrlist.add(16);
		arrlist.add(33);
		arrlist.add(15);
		arrlist.add(42);
		arrlist.add(39);
		arrlist.add(21);
		
		//Collections.sort(arrlist, com);
		
		
		Iterator<Integer> itr = arrlist.iterator();
		
		/*while(itr.hasNext())
		{
			System.out.print(itr.next()+", ");
		}*/
		
		
	}
}