package staticDemo;

public class ProductManager {

	public void add(Product product)
	{
		
		
		
		ProductValidator validator = new ProductValidator();
		if(ProductValidator.isValid(product))  //static yaptığımız için doğrudan çağırabildik.
		{
			System.out.println("Added");
		}
		else {
			System.out.println("Product information is invalid !");
		}
	}
	
	
}
