package collection.list.book;

import java.util.Comparator;

public class BookPublisher implements Comparator<Book>{

	@Override
	public int compare(Book publisher, Book publisher_next) {
		
		return publisher.getBook_publisher().compareTo(publisher_next.getBook_publisher());
	}
	
	

}
