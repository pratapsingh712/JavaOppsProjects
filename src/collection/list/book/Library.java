package collection.list.book;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Library {

	public static void main(String[] args) {
		
		LinkedList<Book> book_list = new LinkedList<Book>();
		
		Book b1 = new Book("The Great Gatsby","F. Scott Fitzgerald","Scribner");
		Book b2 = new Book("To Kill a Mockingbird","Harper Lee","J. B. Lippincott & Co.");
		Book b3 = new Book("1984","George Orwell","Secker & Warburg");
		Book b4 = new Book("Pride and Prejudice","Jane Austen","T. Egerton, Whitehall");
		Book b5 = new Book("Harry Potter and the Philosopher's Stone","J.K. Rowling","Bloomsbury");
		Book b6 = new Book("The Hobbit","J.R.R. Tolkien","Allen & Unwin");
		Book b7 = new Book("The Lord of the Rings","J.R.R. Tolkien","Allen & Unwin");
		Book b8 = new Book("Jane Eyre","Charlotte Brontë","Smith, Elder & Co.");
		Book b9 = new Book("To the Lighthouse","Virginia Woolf","Hogarth Press");
		Book b10 = new Book("The Catcher in the Rye","J.D. Salinger","Little, Brown and Company");
		Book b11 = new Book("The Hobbit","J.R.R. Tolkien","Allen & Unwin");
		Book b12 = new Book("The Lord of the Rings","J.R.R. Tolkien","Allen & Unwin");
		Book b13 = new Book("The Hobbit","J.R.R. Tolkien","Allen & Unwin");
		Book b14 = new Book("The Lord of the Rings","J.R.R. Tolkien","Allen & Unwin");
		
		
		book_list.add(b1);
		book_list.add(b2);
		book_list.add(b3);
		book_list.add(b4);
		book_list.add(b5);
		book_list.add(b6);
		book_list.add(b7);
		book_list.add(b8);
		book_list.add(b9);
		book_list.add(b10);
		book_list.add(b11);
		book_list.add(b12);
		book_list.add(b13);
		book_list.add(b14);
		
				
		// now to display books published by the same author 
		
		System.out.println("Do you want to display book published by the same author ? yes/no");
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		boolean noBookFound = true;
		
		if(str.equals("yes"))
		{
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			
			authorFound(book_list,noBookFound); // method to find to book published by the same author inside library
		}
		else
		{
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			
			displayList(book_list);
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		//String book_name, String book_author, String book_publisher
		
		System.out.println("Enter option to sort the library based on \n1.ID\n2.book_name\n3.book_author\n4.book_publisher");
		int option = sc.nextInt();
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		switch(option)
		{
		case 1: BookSort id = new BookSort(); 
				Collections.sort(book_list,id);
				displayList(book_list);
			break;
			
			
		case 2: BookName name = new BookName();
				Collections.sort(book_list,name);
				displayList(book_list);
			break;
			
			
		case 3: BookAuthor author = new BookAuthor();
				Collections.sort(book_list,author);
				displayList(book_list);
			break;
			
			
		case 4: BookPublisher publisher = new BookPublisher();
				Collections.sort(book_list,publisher);
				displayList(book_list);
			break;
			
			
		default : System.out.println("Invalid input!");
		}
		
		sc.close();
		
	}

	public static void displayList(LinkedList<Book> book_list) {
		
		for(int i=0;i<book_list.size();i++)
		{
			System.out.println(book_list.get(i));
		}
		
	}

	public static void authorFound(LinkedList<Book> book_list, boolean noBookFound) {
		
		// i will have to create another list to do the comparision
		
		for (int i = 0; i < book_list.size(); i++)
		{
            
			Book currentBook = book_list.get(i);
            // Check if the author of the current book has already been printed
            
			boolean authorPrinted = false;

            // Compare with other books
            for (int j = i + 1; j < book_list.size(); j++) 
            {
               
            	Book compareBook = book_list.get(j);
            	
                // If the authors match, print the details of both books
            	
            	if(compareBook.getBook_author()!="-1")
            	{
		                if (currentBook.getBook_author().equals(compareBook.getBook_author()))
		                {
		                    if (!authorPrinted)
		                    {
		                        System.out.println(currentBook);
		                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		                        if(checkBookName(currentBook,compareBook))
			                    {	
			                    	System.out.println(compareBook);
			                    }
		                        authorPrinted = true;
		                    }
		              		  
		                    compareBook.setBook_author("-1");
		                }
		        }
            }	
		}
	}

	public static boolean checkBookName(Book currentBook, Book compareBook) {
		
		if(currentBook.getBook_name().equals(compareBook.getBook_name()))
		{
			return false;
		}
		
		return true;
		
	}
}
