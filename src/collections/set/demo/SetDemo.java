package collections.set.demo;

import java.util.*;

public class SetDemo {

	public static void main(String[] args) {
		
		HashSet<Integer> h1 = new HashSet<Integer>();
		h1.add(25);
		h1.add(15);
		h1.add(35);
		h1.add(-25);
		h1.add(565);
		h1.add(235);
		h1.add(15);
		h1.add(65);
		h1.add(25);
		System.out.println("Hash set = "+h1); // Set interface does not allow duplicate elements, Unordered storage
		
		TreeSet<Integer> t1 = new TreeSet<Integer>();
		t1.add(25);
		t1.add(15);
		t1.add(35);
		t1.add(-25);
		t1.add(565);
		t1.add(235);
		t1.add(15);
		t1.add(65);
		t1.add(25);
		System.out.println("Tree set = "+t1); // no duplicate, stores the element in ascending order
		
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
		lhs.add(25);
		lhs.add(15);
		lhs.add(35);
		lhs.add(-25);
		lhs.add(565);
		lhs.add(235);
		lhs.add(15);
		lhs.add(65);
		lhs.add(25);
		System.out.println("Linked Hash Set = "+lhs); // follows insertion order with no duplicate values
		
	}
}
