package collection.student.rank.iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class StudentDetails {

	public static void main(String[] args) {
		
		Student student = new Student("Alice Johnson", "123 Maple Street, Springfield", 89.5);
		Student student1 = new Student("Bob Smith", "456 Oak Avenue, Rivertown", 78.3);
		Student student2 = new Student("Emily Davis", "789 Pine Road, Lakeside", 91.7);
		Student student3 = new Student("Michael Brown", "321 Elm Lane, Hilltop", 85.2);
		Student student4 = new Student("Sophia Wilson", "654 Birch Boulevard, Meadowview", 92.8);
		Student student5 = new Student("Daniel Martinez", "987 Cedar Court, Valleytown", 79.6);
		Student student6 = new Student("Olivia Taylor", "234 Willow Way, Sunset", 88.1);
		Student student7 = new Student("Ethan Thomas", "567 Sycamore Drive, Lakeshore", 83.9);
		Student student8 = new Student("Ava Anderson", "890 Poplar Lane, Hillcrest", 95.4);
		Student student9 = new Student("Liam Garcia", "432 Magnolia Street, Hillside", 87.6);		
		
		
		ArrayList<Student> studentlist = new ArrayList<>();
		studentlist.add(student);
		studentlist.add(student1);
		studentlist.add(student2);
		studentlist.add(student3);
		studentlist.add(student4);
		studentlist.add(student5);
		studentlist.add(student6);
		studentlist.add(student7);
		studentlist.add(student8);
		studentlist.add(student9);
		
		
		// now i need to display the student detail based on decreasing percentage or say decreasing order of rank
		
		
		
		Collections.sort(studentlist, new RankSort());
		
		//System.out.println(studentlist);
		
		Iterator<Student> itrstudent = studentlist.iterator();
		
		while(itrstudent.hasNext())
		{
			System.out.println(itrstudent.next());
		}
	}
}
