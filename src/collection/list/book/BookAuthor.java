package collection.list.book;

import java.util.Comparator;

public class BookAuthor implements Comparator<Book>{

	@Override
	public int compare(Book author, Book author_next) {
		
		return author.getBook_author().compareTo(author_next.getBook_author());
	}
	
	

}
