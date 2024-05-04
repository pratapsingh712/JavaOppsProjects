package multipleInheritance;

public class Student {

	private int id;
	
	private String name;
	
	private static int idgen = 722;
	
	public Student()
	{
		id = idgen++;
	}
	
	public Student(String name)
	{
		this();
		this.name = name;
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
