package cabCustomer;

public class CabCustomer {

	/*
	 * Define the following in the class CabCustomer
Variables private:
custld int, customerName String, pickupLocation String,dropLocation String, distance int,phone long
Generate Getter/Setter for all fields
Implement the default constructor
Generate the parameterized constructor in the order to initialize the data members of a class custid, Name, Pickup, Drop, Distance, Phone
calculateBill:*/

	private int custId;
	private String customerName;
	private String pickupLocation;
	private String dropLocation;
	private int distance;
	private long phone;
	
	
	public CabCustomer() {}
	
	public CabCustomer(int custId, String customerName, String pickupLocation, String dropLocation, int distance, long phone)
	{
		this.custId = custId;
		this.customerName = customerName;
		this.pickupLocation = pickupLocation;
		this.dropLocation = dropLocation;
		this.distance = distance;
		this.phone = phone;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getPickupLocation() {
		return pickupLocation;
	}

	public void setPickupLocation(String pickupLocation) {
		this.pickupLocation = pickupLocation;
	}

	public String getDropLocation() {
		return dropLocation;
	}

	public void setDropLocation(String dropLocation) {
		this.dropLocation = dropLocation;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}
	
	
	public double calculateBill()
	{
		double bill = 0;
		
		if(distance<=4)
		{
			bill = 80.00;
		}
		else if(distance>=4)
		{
			distance = distance - 4;
			bill = 80 + (distance * 6);
		}
		
		return bill;
	}

	@Override
	public String toString() {
		return "CabCustomer [custId=" + custId + ", customerName=" + customerName + ", pickupLocation=" + pickupLocation
				+ ", dropLocation=" + dropLocation + ", distance=" + distance + ", phone=" + phone + ", calculateBill()=" + calculateBill() + "]";
	}


/*Method Name :calculateBill
Return Type
double
Description: following rules
method should calculate and return the customer bill based on
1) if the customer's travel distance is below or equal to 4 kms then return 80.00 (Rs).
2) if the customer travel distance is above 4 kms calculate
bill 80+ 6 per each km.
Ex: Any distance for new customer return 0;
distance 4 return 80
distance 6 return 80 + (2 * 6);
A class CabCustomer Service Tester is given with main() where you can create various objects and
Print the details of the customer who has the highest bill.
	 */
	
}  
