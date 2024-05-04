package abstractStudentUsingArray;

import java.text.DecimalFormat;
import java.util.Arrays;

public class CLSS8 extends STU{
	
	private int marks[];
	
	public CLSS8()
	{
		
	}
	
	public CLSS8(String name, int[] marks)
	{
		super(name);
		this.marks = marks;
	}

	public int[] getMarks() {
		return marks;
	}

	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	
	protected double findPercentage()
	{
		double total = 0;
		double percentage = 0;
		
		for(int i=0;i<marks.length;i++)
		{
			total += marks[i];
		}
		
		percentage = (total/marks.length);
		
		DecimalFormat d = new DecimalFormat("0.##");
		String res = d.format(percentage);
				
		return Double.parseDouble(res);
	}

	@Override
	public String toString() {
		return super.toString()+"EighthStandard [marks=" + Arrays.toString(marks) + "]"+"percentage = "+findPercentage();
	}

	
}
