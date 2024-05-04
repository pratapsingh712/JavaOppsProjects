package classes_objects;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp = new Employee();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Employee name:");
		emp.name = sc.next();
		
		System.out.println("Enter the Employee id :");
		emp.emp_id = sc.nextInt();
		
		System.out.println("Enter the Employee Department :");
		emp.dept = sc.next();
		
		System.out.println("Enter the Employee Designation :");
		emp.designation = sc.next();
		
		System.out.println("Enter the Employee salary :");
		emp.salary = sc.nextDouble();
		
		System.out.println("================================================");
		
		/*System.out.println("Your Employee Details are :");
		System.out.println("Employee Name : "+emp.name);
		System.out.println("Employee ID : "+emp.emp_id);
		System.out.println("Employee Department : "+emp.dept);
		System.out.println("Employee Designation : "+emp.designation);
		System.out.println("Employee Salary : "+emp.salary);
		System.out.println("Employee monthly salary is : "+emp.salary);
		System.out.println("Employee Annual Salay is : "+emp.getAnnualSalary());*/
		
		System.out.println(emp.toString());		
		
		sc.close();
	}

}
