package student.rank;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class StudentRankList extends RankSort{

	public static void main(String[] args) {
		
		Student st = new Student("John Doe", "123 Main St, City, Country", 85.5);
		Student st1 = new Student("Jane Smith", "456 Elm St, City, Country", 90.2);
		Student st2 = new Student("Michael Johnson", "789 Oak St, City, Country", 78.9);
		Student st3 = new Student("Emily Davis", "321 Pine St, City, Country", 92.3);
		Student st4 = new Student("Christopher Lee", "654 Maple St, City, Country", 87.6);
		
		LinkedList<Student> stulist = new LinkedList<>();
		
		stulist.add(st4);
		stulist.add(st3);
		stulist.add(st2);
		stulist.add(st1);
		stulist.add(st);
		
		// i want to display my list of student in correct order 
		
		
		Collections.sort(stulist,new RankSort());
		
		Iterator<Student> itr = stulist.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}
}
