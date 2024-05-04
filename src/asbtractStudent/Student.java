package asbtractStudent;

public abstract class Student {

	private int id;
	
	private String name;

	private static int idgen = 101;
	
	protected abstract double findPercentage();
	
	
	public Student()
	{
		this.id = idgen++;
	}
	
	public Student(String name)
	{
		this();
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}	
	
	
	
}
