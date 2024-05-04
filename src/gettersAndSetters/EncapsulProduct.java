package gettersAndSetters;

public class EncapsulProduct {

	private String product_name;
	private int cost_of_product;
	private int no_of_product;
	
	EncapsulProduct(){
		
	}
	
	EncapsulProduct(String name, int cost, int no)
	{
		product_name = name;
		cost_of_product = cost;
		no_of_product = no;
	}
	
	public String getProduct_name() {
		return product_name;
	}
	
	public void setProduct_name(String name) {
		product_name = name;
	}
	
	public int getCost_of_Product() {
		return cost_of_product;
	}
	
	public void setCost_of_Product(int cost)
	{
		cost_of_product = cost;
	}
	
	public int get_no_product()
	{
		return no_of_product;
	}
	
	public void get_no_of_product(int no) {
		no_of_product = no;
	}
	
	public int getTotalCost() {
		return cost_of_product * no_of_product;
	}
	
	public boolean isAvailable(String name)
	{
		if(product_name.equals(name))
			return true;
		
		return false;
	}
	
	public String toString() {
		return "product name = "+product_name+"\n cost of product : "+cost_of_product+
				"\nNo of product : "+no_of_product;
	}
	
}
