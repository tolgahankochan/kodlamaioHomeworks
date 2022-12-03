package staticDemo;

import java.security.PublicKey;

public class ProductValidator {
	
	
	static {
		System.out.println("Static Constructor worked !");
	}
	
	public ProductValidator() {
		System.out.println("Constructor worked !");
	}
	
	
	public static boolean isValid(Product product) {
		
		if (product.price > 0 && !product.name.isEmpty() ) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public void bisey() {
		//static olarak oluşturulmadığı için doğrudan çalıştırılmaz, newlenmesi gerekir.
	}
	
	
}
