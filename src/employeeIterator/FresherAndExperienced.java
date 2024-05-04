package employeeIterator;

import java.util.ArrayList;
import java.util.Iterator;

public class FresherAndExperienced {

	public static void main(String[] args) {
		
		Employee emp = new Employee("John Doe",1500000);
		Employee emp1 = new Employee("Jane Smith",1800000);
		Employee emp2 = new Employee("Michael Johnson",1600000);
		Employee emp3 = new Employee("Emily Davis",1700000);
		Employee emp4 = new Employee("Christopher Lee",1900000);
		Employee emp5 = new Employee("Jessica Brown",1750000);
		Employee emp6 = new Employee("David Wilson",2000000);
		Employee emp7 = new Employee("Sarah Martinez",1950000);
		Employee emp8 = new Employee("Daniel Anderson",2100000);
		Employee emp9 = new Employee("Jennifer Taylor",2200000);
		Employee emp10 = new Employee("Matthew Garcia",2300000);
		
		Employee emp11 = new Employee("Amanda Thomas",2400000);
		Employee emp12 = new Employee("James Hernandez",2500000);
		Employee emp13 = new Employee("Nicole Lopez",2600000);
		Employee emp14 = new Employee("Robert Hill",2700000);
		Employee emp15 = new Employee("Elizabeth Clark",2800000);
		Employee emp16 = new Employee("William Lewis",2900000);
		Employee emp17 = new Employee("Melissa Walker",3000000);
		Employee emp18 = new Employee("Brian Young",3100000);
		Employee emp19 = new Employee("Jane Smith",1800000);
		Employee emp20 = new Employee("Michelle Hall",3200000);
		
		
		ArrayList<Employee> employee = new ArrayList<>();
		
		employee.add(emp);
		employee.add(emp2);
		employee.add(emp1);
		employee.add(emp3);
		employee.add(emp4);
		employee.add(emp5);
		employee.add(emp6);
		employee.add(emp7);
		employee.add(emp8);
		employee.add(emp9);
		employee.add(emp10);
		employee.add(emp11);
		employee.add(emp12);
		employee.add(emp13);
		employee.add(emp14);
		employee.add(emp15);
		employee.add(emp16);
		employee.add(emp17);
		employee.add(emp18);
		employee.add(emp19);
		employee.add(emp20);
		
		
		// to store list of fresher data 
		
		ArrayList<Employee> fresher = new ArrayList<>();
		
		Iterator<Employee> itr = employee.iterator();
		
		while(itr.hasNext())
		{
			Employee ref = itr.next();
			if(ref.getSalary()<2000000)
			{
				fresher.add(ref);
				itr.remove();
			}
		}
		
		System.out.println("Experienced Employee detail :");
		for(Employee empDetail : employee)
		{
			System.out.println(empDetail);
		}
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		System.out.println("Fresher Employee detail :");
		
		Iterator<Employee> itrfresher = fresher.iterator();
		
		while(itrfresher.hasNext())
		{
			System.out.println(itrfresher.next());
		}
		
	}
}
