package asbtractStudent;

import java.text.DecimalFormat;

public  class EleventhStandard extends Student{
	
	private int physics;
	private int chemistry;
	private int maths;
	private int physicsPractical;
	private int chemistryPractical;
	private int hindi;
	private int english;
	
	public EleventhStandard() {
		
	}
	
	public EleventhStandard(String name, int maths, int physics, int chemistry, int physicsPractical, int chemistryPractical, int hindi, int english)
	{
		super(name);
		this.maths = maths;
		this.physics = physics;
		this.chemistry = chemistry;
		this.physicsPractical = physicsPractical;
		this.chemistryPractical = chemistryPractical;
		this.english = english;
		this.hindi = hindi;
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

	public int getMaths() {
		return maths;
	}

	public void setMaths(int maths) {
		this.maths = maths;
	}

	public int getPhysicsPractical() {
		return physicsPractical;
	}

	public void setPhysicsPractical(int physicsPractical) {
		this.physicsPractical = physicsPractical;
	}

	public int getChemistryPractical() {
		return chemistryPractical;
	}

	public void setChemistryPractical(int chemistryPractical) {
		this.chemistryPractical = chemistryPractical;
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
	
	protected double findPercentage() {
		
		double pTotal = chemistryPractical+physicsPractical;
		double tTotal = maths+physics+chemistry+hindi+english;
		
		double result =  0.6*(tTotal/5)+0.4*(pTotal/2);
		
		DecimalFormat d = new DecimalFormat("0.##");
		String res = d.format(result);
		
		return Double.parseDouble(res);
	
	}
	@Override
	public String toString() {
		return "EleventhStandard [physics=" + physics + ", chemistry=" + chemistry + ", maths=" + maths
				+ ", physicsPractical=" + physicsPractical + ", chemistryPractical=" + chemistryPractical + ", hindi="
				+ hindi + ", english=" + english + ", Percentage "+findPercentage()+", "+ super.toString() + "]";
	}

	
}
