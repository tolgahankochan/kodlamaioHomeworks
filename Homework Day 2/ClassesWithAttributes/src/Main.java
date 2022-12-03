
public class Main {

	public static void main(String[] args) {
		
		
		Product product1 = new Product (1,"Computer","Lenovo",5,10);
		
		/*
		product1.setName("Laptop");
		product1.setId(1);
		product1.setDescription("Lenovo Laptop");
		product1.setPrice(5000);
		product1.setStockAmount(3);
		*/
		
		System.out.println(product1.getName());
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product1);
		
		System.out.println(product1.getKod());

	}

}
