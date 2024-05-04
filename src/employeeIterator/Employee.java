package employeeIterator;

public class Employee {

		private int id;
		
		private static int idgen = 50;
		
		private String name;
		
		private double salary;
		
		
		public Employee()
		{
			id = idgen++;
		}
		
		public Employee(String name, double salary)
		{
			this();
			this.name = name;
			this.salary = salary;
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

		public double getSalary() {
			return salary;
		}

		public void setSalary(double salary) {
			this.salary = salary;
		}

		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
		}
		
}
