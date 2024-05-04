package multipleInheritance;

import java.text.DecimalFormat;

public class MVJCE extends Student implements Percentage,Attendance {

	private double totalClasses;
	
	private double classAttended;
	
	private double totalMarks;
	
	private double totalSubject;
	
	private String name;
	
	public MVJCE()
	{

	}
	
	public MVJCE(String name,double totalClasses,double classAttended, double totalMarks, double totalSubject)
	{
		super(name);
		this.totalClasses = totalClasses;
		this.classAttended = classAttended;
		this.totalMarks = totalMarks;
		this.totalSubject = totalSubject;
	}

	public double getTotalClasses() {
		return totalClasses;
	}

	public void setTotalClasses(int totalClasses) {
		this.totalClasses = totalClasses;
	}

	public double getClassAttended() {
		return classAttended;
	}

	public void setClassAttended(int classAttended) {
		this.classAttended = classAttended;
	}

	public double getTotalMarks() {
		return totalMarks;
	}

	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}

	public double getTotalSubject() {
		return totalSubject;
	}

	public void setTotalSubject(int totalSubject) {
		this.totalSubject = totalSubject;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public double getPercentage()
	{
		Double marks = totalMarks/totalSubject;
		
		DecimalFormat twoDecimalPoint = new DecimalFormat("0.##");
		
		String result = twoDecimalPoint.format(marks);
		
		return Double.parseDouble(result);
	}
	
	public double getAttendance()
	{ 
		Double attendance = (classAttended/totalClasses)*100;
			
		DecimalFormat twoDecimalPoint = new DecimalFormat("0.##");
			
		String result = twoDecimalPoint.format(attendance);
			
		return Double.parseDouble(result);
	}

	@Override
	public String toString() {
		return super.toString()+"\n MVJCE [totalClasses=" + totalClasses + ", classAttended=" + classAttended + ", totalMarks=" + totalMarks
				+ ", totalSubject=" + totalSubject + ", getPercentage()=" + getPercentage()
				+ ", getAttendance()=" + getAttendance() + "]";
	}
	
	
	
}
