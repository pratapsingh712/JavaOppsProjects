package abstractStudentUsingArray;

public abstract class STU{

	private int id;
	private static int idgen = 100;
	private String name;
	
	protected abstract double findPercentage();
	
	public STU()
	{
		id = idgen++;
	}
	
	public STU(String name)
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
