package collection.list.Products;

public class Product implements Comparable<Product>{

	private int id;
	private static int idgen = 101;
	private String name;
	private int no_of_Product;
	private int cost_per_unit;
	
	@Override
	public int compareTo(Product product) {
		
		return name.compareTo(product.getName());
		
	}
	
	public Product()
	{
		id = idgen++;
	}
	
	public Product(String name, int no_of_product,int cost)
	{
		this();
		this.name = name;
		this.no_of_Product = no_of_product;
		this.cost_per_unit = cost;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNo_of_Product() {
		return no_of_Product;
	}

	public void setNo_of_Product(int no_of_Product) {
		this.no_of_Product = no_of_Product;
	}

	public int getCost_per_unit() {
		return cost_per_unit;
	}

	public void setCost_per_unit(int cost_per_unit) {
		this.cost_per_unit = cost_per_unit;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", no_of_Product=" + no_of_Product + ", cost_per_unit="
				+ cost_per_unit + "]";
	}
	
}
