package interfaceBill;

public interface Bill {

/*
 * Create an interface Bill with following methods
 *  double calcBill()
 *  void displayBill()
 *  Create classes WBill (Water Bill) and EBill (Electric Bill) which implements Bill interface.
 *  Create a class CalculateBillAmount which has main() method .Take user input and based on user's 
 *  choice 8 create either instance of WBill or EBill and display its amount.
 */
	
	public double calcBill();
	
	public void displayBill();
}
