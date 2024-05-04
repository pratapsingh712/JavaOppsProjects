package collection.list.Products;

import java.util.*;

public class ProductMain {

	public static void main(String[] args) {
		
		Product p2 = new Product("char",140,650);
		Product p3 = new Product("fan",15,1000);
		Product p1 = new Product("table",12,3123);
		Product p4 = new Product("ac",5,366650);
		
		ArrayList<Product> al = new ArrayList<Product>();
		al.add(p1);
		al.add(p2);
		al.add(p3);
		al.add(p4);
		
		
		System.out.println("Printing Details: ");
		
		displayProduct(al);
		
		System.out.println("======================================");
		System.out.println("getting just the product name and cost :");
		
		for(int i=0;i<al.size();i++)
		{
			Product p = al.get(i);
			System.out.println("product name = "+p.getName()+", product cost = "+p.getCost_per_unit());
		}
		
		// i am trying to sort procut list based on it's name 
		
		Collections.sort(al);
		
		System.out.println("======================================");
		
		System.out.println("After sorting the product based on it's name :");
		
		displayProduct(al);
		
	}

	public static void displayProduct(ArrayList<Product> al) {
		
		for(Product p : al)
		{
			System.out.println(p);
		}
	}
}
