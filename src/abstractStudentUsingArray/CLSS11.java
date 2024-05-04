package abstractStudentUsingArray;

import java.util.Arrays;

public class CLSS11 extends STU{

	private int theory[];
	private int practical[];

	public CLSS11()
	{
		
	}
	
	public CLSS11(String name,int[] t, int[] p)
	{
		super(name);
		this.theory = t;
		this.practical =p;
	}
	
	public int[] getTheory() {
		return theory;
	}

	public void setTheory(int[] theory) {
		this.theory = theory;
	}

	public int[] getPractical() {
		return practical;
	}

	public void setPractical(int[] practical) {
		this.practical = practical;
	}
	
	protected double findPercentage()
	{
		int total = 0;
		
		for(int i=0;i<theory.length;i++)
		{
			total += theory[i];
		}
		
		int total1 = 0;
		
		for(int i=0;i<practical.length;i++)
		{
			total1 += practical[i];
		}
		
		total = total+total1;
		int length = practical.length+theory.length;
		
		return (float)(total)/length;
	}

	
	public String toString() {
		return super.toString()+"Class11 [theory=" + Arrays.toString(theory) + ", practical=" + Arrays.toString(practical)
				+ ", getTheory()=" + Arrays.toString(getTheory()) + ", getPractical()="
				+ Arrays.toString(getPractical()) + ", findPercentage()=" + findPercentage() + "]";
	}
	
	
}
