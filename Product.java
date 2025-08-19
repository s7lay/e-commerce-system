package classes;

public abstract class Product {
	
	private String code;
	
	private String name;
	
	private double price;
	
	private int stock;
	
	

	public Product(String code, String name, double price, int stock) {
		this.code = code;
		this.name = name;
		this.price = price;
		this.stock = stock;
		
	
	}
	
	public String getCode() {
		return code;
	}
	
	public String getName() {
		return name;
	}
	
	public int getStock() {
		return stock;
	}
	
	public void setStock(int stock) {
		this.stock=stock;
		
	}
	
	public double getPrice() {
		return price;
	}
	
	
	public void displayInfo() {
		
		System.out.println("ürün bilgileri");
		System.out.println("---------------");
		System.out.println("adı "+getName());
		System.out.println("kodu "+getCode());
		System.out.println("fiyatı "+getPrice());
		System.out.println("stok miktarı "+getStock());
		
	}
	
	

	
	
	
	
	

}
