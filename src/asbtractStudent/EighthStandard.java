package asbtractStudent;

import java.text.DecimalFormat;

public class EighthStandard extends Student{
	
	private int maths;
	private int physics;
	private int chemistry;
	private int english; 
	private int hindi;
	
	public EighthStandard(String string, int[] marks){}
	
	public EighthStandard(String name,int maths, int physics, int chemistry, int english, int hindi )
	{
		super(name);
		this.maths = maths;
		this.physics = physics;
		this.chemistry = chemistry;
		this.english = english;
		this.hindi = hindi;		
	}
	
	public int getMaths() {
		return maths;
	}

	public void setMaths(int maths) {
		this.maths = maths;
	}

	public int getPhysics() {
		return physics;
	}

	public void setPhysics(int physics) {
		this.physics = physics;
	}

	public int getChemistry() {
		return chemistry;
	}

	public void setChemistry(int chemistry) {
		this.chemistry = chemistry;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int getHindi() {
		return hindi;
	}

	public void setHindi(int hindi) {
		this.hindi = hindi;
	}

	@Override
	protected double findPercentage() {
		double total = maths+physics+chemistry+english+hindi;
		total = (total/500)*100;
		DecimalFormat d = new DecimalFormat("0.##");
		String res = d.format(total);
			
		return Double.parseDouble(res);
		
	}

	@Override
	public String toString() {
		return "EighthStandard [maths=" + maths + ", physics=" + physics + ", chemistry=" + chemistry + ", english="
				+ english + ", hindi=" + hindi + ", Percentage "+findPercentage()+", "+ super.toString() + "]";
	}
	
	

}
