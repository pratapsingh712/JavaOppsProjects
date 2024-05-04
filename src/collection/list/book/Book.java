package collection.list.book;

public class Book {

	private int id;
	
	private static int idgen = 101;
	
	private String book_name;
	
	private String book_author;
	
	private String book_publisher;
	
	
	public Book()
	{
		id = idgen++;
	}


	public Book(String book_name, String book_author, String book_publisher) {
		this();
		this.book_name = book_name;
		this.book_author = book_author;
		this.book_publisher = book_publisher;
	}


	public String getBook_name() {
		return book_name;
	}


	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}


	public String getBook_author() {
		return book_author;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public static int getIdgen() {
		return idgen;
	}


	public static void setIdgen(int idgen) {
		Book.idgen = idgen;
	}


	public void setBook_author(String book_author) {
		this.book_author = book_author;
	}


	public String getBook_publisher() {
		return book_publisher;
	}


	public void setBook_publisher(String book_publisher) {
		this.book_publisher = book_publisher;
	}


	@Override
	public String toString() {
		return "Book [id=" + id + ", book_name=" + book_name + ", book_author=" + book_author + ", book_publisher="
				+ book_publisher + "]";
	}
	
}
