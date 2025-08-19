package classes;


public class Electronics extends Product {
	
	private String brand;

	public Electronics(String code, String name, double price, int stock,String brand) {
		super(code, name, price, stock);
		this.brand=brand;
		
		
	}

	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("marka"+brand);
	}
	
	

	
	
	
	
	
	
}
