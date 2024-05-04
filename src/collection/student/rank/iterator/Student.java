package collection.student.rank.iterator;

public class Student {
	
	private int id;
	
	private static int idgen = 101;
	
	private String name;
	
	private String address;
	
	private double percentage;
	
	public Student()
	{
		id = idgen++;
	}
	
	public Student(String name, String address, double percentage)
	{
		this();
		this.name = name;
		this.address = address;
		this.percentage = percentage;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", percentage=" + percentage + "]";
	}
	
}
