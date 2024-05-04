package collection.list.book;

import java.util.Comparator;

public class BookSort implements Comparator<Book>{

	@Override
	public int compare(Book book_id, Book book_id_next) {
		
		return Integer.compare(book_id.getId(), book_id_next.getId());
	}
	
	

}
