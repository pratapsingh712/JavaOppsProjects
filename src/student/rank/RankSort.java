package student.rank;

import java.util.Comparator;

public class RankSort implements Comparator<Student>{

	@Override
	public int compare(Student percentagefirst, Student percentagenext) {
		
		return - Double.compare(percentagefirst.getPercentage(), percentagenext.getPercentage());
		
	}

}
