
public class Product {
	
	private int productId;
	
	private String name;
	
	private String description;
	
	private double price;
	
	public Product(int productId, String name, String description, double price) {
		
		this.productId = productId;
		
		this.name = name;
		
		this.description = description;
		
		this.price = price;
		
	}
	
	public Product() {}
	
	public String getName() {
		
		return name;
		
	}
	
	public void setName(String name) {
		
		this.name = name;
		
	}
	
	public String getDescription() {
		
		return description;
		
	}
	
	public void setDescription(String description) {
		
		this.description = description;
		
	}
	
	public double getPrice() {
		
		return price;
		
	}
	
	public void setPrice(double price) {
		
		this.price = price;
		
	}
	
	public int getProductId() {
		
		return productId;
		
	}
	
	public void setProductId(int productId) {
		
		this.productId = productId;
		
	}
	
	public String toString() {
		
		return "Product [name=" + name + ", descrption=" + description + ", price=" + price + "]";
		
	}
}
