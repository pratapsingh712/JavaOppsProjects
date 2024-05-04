package interfaceStudent;

import java.text.DecimalFormat;
import java.util.Arrays;

public class Class11 {

	private int id;
	private String name;
	private int theoryMarks[];
	private int practicalMarks[];
	private int hindi;
	private int english;
	private static int idgen = 100;
	
	public Class11()
	{
		id = idgen++;
	}
	
	public Class11(String name, int theoryMarks[], int practicalMarks[], int hindi, int english)
	{
		this();
		this.name = name;
		this.theoryMarks = theoryMarks;
		this.practicalMarks = practicalMarks;
		this.hindi = hindi;
		this.english = english;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int[] getTheoryMarks() {
		return theoryMarks;
	}

	public void setTheoryMarks(int[] theoryMarks) {
		this.theoryMarks = theoryMarks;
	}

	public int[] getPracticalMarks() {
		return practicalMarks;
	}

	public void setPracticalMarks(int[] practicalMarks) {
		this.practicalMarks = practicalMarks;
	}

	public int getHindi() {
		return hindi;
	}

	public void setHindi(int hindi) {
		this.hindi = hindi;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}
	
	public double findPercentage()
	{
		double total = 0;
		
		for(int i=0;i<theoryMarks.length;i++)
		{
			total += theoryMarks[i]+practicalMarks[i];
		}
		
		total = total+hindi+english;
		
		double percentage = (total/(theoryMarks.length+practicalMarks.length));
		
		DecimalFormat d = new DecimalFormat("0.##");
		String res = d.format(percentage);
		
		
		return Double.parseDouble(res);
	}

	@Override
	public String toString() {
		return "Class11 [id=" + id + ", name=" + name + ", theoryMarks=" + Arrays.toString(theoryMarks)
				+ ", practicalMarks=" + Arrays.toString(practicalMarks) + ", hindi=" + hindi + ", english=" + english
				+ ", findPercentage()=" + findPercentage() + "]";
	}
	
	
}
