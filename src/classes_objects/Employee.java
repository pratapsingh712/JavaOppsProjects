package classes_objects;

public class Employee {

	// instance variable / fields
	double salary;
	int emp_id;
	String name;
	String dept;
	String designation;
	
	// methods
	
	double getAnnualSalary()
	{
		return 12*salary;
	}
	
	//Predefined Method in JAVA
	
	public String toString()
	{
		return "Employee ID: "+emp_id+" \nEmployee name: "+name+" \nEmployee Department : "+dept+" \nEmployee salary: "+salary+
				"\nEmployee Designation: "+designation+"\nAnnual Salary: "+getAnnualSalary();
	}
}
