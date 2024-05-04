package collection.student.rank.iterator;

import java.util.Comparator;

public class RankSort implements Comparator<Student> {

	public int compare(Student percentage, Student percentagelist) {
		
		return -1 *  Double.compare(percentage.getPercentage(), percentagelist.getPercentage());
		
		
		// multiplying it wil -1 to reverse the order as it was printing the percentage from small to big 
		//return (int) -b;
	}
	
}
