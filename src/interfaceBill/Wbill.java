package interfaceBill;

public class Wbill implements Bill{

	private int id;
	
	private static int idgen = 1205;
	 
	private int units;
	
	public Wbill()
	{
		id = idgen++;
	}
	
	public Wbill(int units)
	{
		this();
		this.units = units;
	}
	
	public int getUnits() {
		return units;
	}

	public void setUnits(int units) {
		this.units = units;
	}

	@Override
	public double calcBill() {
	
		return units*8.2;
	}

	@Override
	public void displayBill() {
	
		System.out.println("Your total bill for user = "+id+" id is = "+calcBill());
		
	}

	@Override
	public String toString() {
		return "Wbill [id=" + id + ", units=" + units + ", calcBill()=" + calcBill() + "]";
	}

}
