package classes;

public class Clothing extends Product {
	
	private String size;

	public Clothing(String code, String name, double price, int stock,String size) {
		super(code, name, price, stock);
	
		this.size=size;
	}

	@Override
	public void displayInfo() {
		
		super.displayInfo();
		System.out.println("beden"+size);
	}
	

	
	
}
