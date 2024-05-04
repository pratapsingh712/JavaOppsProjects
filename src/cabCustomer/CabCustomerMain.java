package cabCustomer;

public class CabCustomerMain {

	public static void main(String[] args) {

		//custld int, customerName String, pickupLocation String,dropLocation String, distance int,phone long
		
		CabCustomer cus1 = new CabCustomer(101,"Tarun","Whitefield","AECS",10,29384792l);
		CabCustomer cus2 = new CabCustomer(105,"Satyam","KR puram","mahadevpura",14,5465498l);
		CabCustomer cus3 = new CabCustomer(104,"Kunga","Sikkim","bangalore",2354,65798712l);
		CabCustomer cus4 = new CabCustomer(102,"Arindum","kilkata","bangalore",3075,6549876l);
		

		System.out.println(cus1.toString());
		System.out.println(cus2.toString());
		System.out.println(cus3.toString());
		System.out.println(cus4.toString());
		
		double max = 0;
		String name = "";
		
		if(cus1.calculateBill()>max)
		{
			max = cus1.calculateBill();
			name = cus1.getCustomerName();
		}
		if(cus2.calculateBill()>max)
		{
			max = cus2.calculateBill();
			name = cus2.getCustomerName();
		}
		if(cus3.calculateBill()>max)
		{
			max = cus3.calculateBill();
			name = cus3.getCustomerName();
		}
		if(cus4.calculateBill()>max)
		{
			max = cus4.calculateBill();
			name = cus4.getCustomerName();
		}
		
		System.out.println("=================================================================");
		System.out.println("This customer has the highest bill : Name "+name+"\nBill amount : "+max);
		
	}

}
