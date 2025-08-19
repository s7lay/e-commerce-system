package classes;

import java.util.ArrayList;
import java.util.List;

public class StoreManager {
	
	
	private List<Product> products=new ArrayList<>();
	
	public void addProduct(Product product) {
		products.add(product);
	}
	
	public Product findProductByCode(String code) {
		
		for (Product i:products) {
			if(i.getCode().equalsIgnoreCase(code)) 
				return i;
			

		}
		
		return null;
	}
	
	public void displayAllProducts() {
		for (Product i:products) {
			i.displayInfo();
			System.out.println("------------");
		}
	}
	
	
	public void purchaseProduct(String code,int quantity) {
		Product i =findProductByCode(code);
		if(i!=null) {
			if(i.getStock()>=quantity) {
				i.setStock(i.getStock()-quantity);
				double totalCost=i.getPrice()*quantity;
				
				System.out.println(quantity+" adet"+i.getName()+" satın alındı.Toplam: "+totalCost+"tl");
			
			}
			
			else {
				System.out.println("yeterli stok yok");
				
			}
			
		}
		else {
			System.out.println("ürün bulunamadı");
		}
	}
	
	
	public void initializeProducts() {
		addProduct(new Electronics("E1", "TELEFON", 20000, 3, "SAMSUNG"));
		addProduct(new Electronics("E2", "BİLGİSAYAR", 60000, 5, "LENOVO"));
		addProduct(new Clothing("C1", "etek", 600, 5, "s"));
		addProduct(new Clothing("C2", "tişört", 400, 7, "xl"));
	}
			
			

}
