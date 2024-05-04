package collection.list.book;

import java.util.Comparator;

public class BookName implements Comparator<Book>{

	@Override
	public int compare(Book book_name, Book book_name_next) {
		
		return book_name.getBook_name().compareTo(book_name_next.getBook_name());
	}
	
	

}
