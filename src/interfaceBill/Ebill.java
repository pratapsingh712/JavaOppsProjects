package interfaceBill;

public class Ebill implements Bill{

	private int units;
	
	private int id;
	
	private static int idgen = 100;
	
	public Ebill()
	{
		id = idgen++;
	}
	
	public Ebill(int units)
	{
		this();
		this.units = units;
	}
	
	
	@Override
	public double calcBill() {
		
		return units*6.5;
	}

	@Override
	public void displayBill() {    
		
		System.out.println("Your total bill for user = "+id+" id is = "+calcBill());
		
	}

	public int getUnits() {
		return units;
	}

	public void setUnits(int units) {
		this.units = units;
	}

	@Override
	public String toString() {
		return "Ebill [units=" + units + ", id=" + id + ", calcBill()=" + calcBill() + "]";
	}
	
	

}
