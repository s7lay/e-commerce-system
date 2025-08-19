package classes;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in);
		
		StoreManager manager=new StoreManager();
		manager.initializeProducts();
		
		
		
		int choice;
		
		do {
			System.out.println("e commerce sistemi");
			System.out.println("1>>>tüm ürünleri listele");
			System.out.println("2>>>satın al");
			System.out.println("3>>>çıkış");
			System.out.println("seçiminiz:");
			choice=scanner.nextInt();
			scanner.nextLine();
			
			
			switch (choice) {
			case 1:
				manager.displayAllProducts();
				break;
			case 2:
				System.out.println("ürün kodu:");
				String code=scanner.nextLine();
				System.out.println("miktar");
				int quantity=scanner.nextInt();
				scanner.nextLine();
				manager.purchaseProduct(code, quantity);
				break;
				
				
			case 3:
				System.out.println("sistemden çıkış yapılıyor...");
				System.out.println("iyi günler");
				break;
			default:
				System.out.println("geçersiz seçim");
				
			}
			
		} while (choice!=3);
		
		scanner.close();
	}

}
