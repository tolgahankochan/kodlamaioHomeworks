package classes;

public class Main {

	public static void main(String[] args) {
		
		
		// classlar referans tiptir.
		
		
		CustomerManager customerManager1 = new CustomerManager();
		
		CustomerManager customerManager2 = new CustomerManager();
		
		customerManager1 = customerManager2;  // customerManager1'in referans numarası artık customerManager2'nin referans numarası oldu.
		// Garbage collector tarafından customerManager1'in refer ansındaki değer temizlenecek ve boşaltılacaktır.
		
		//CustomerManager bir türdür. ( int number vb.)
		
		customerManager1.Add();
		customerManager1.Remove();
		customerManager1.Update();
		
		
		

	}

}
