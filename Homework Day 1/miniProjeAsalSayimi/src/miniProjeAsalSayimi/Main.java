package miniProjeAsalSayimi;

public class Main {

	public static void main(String[] args) {
		
		
		int number = 60 ; 
		
		//int remainder = number % 2 ; Kalan 25'in 2'ye bölümünden kalan değerdir.

		
		int meter = 0 ; 
		
		System.out.println("Your number : "+number);
		
		System.out.println("Status of number : ");
		
		/*Veya meter yerine boolean bir değer döndürebilirdik. True False değerine göre asallık belirlenebilirdi.
		 Burada sayaç yöntemi kullanarak oluşturdum. 
		 */
		
		// İstisna durum : 
		
		if(number==1) {
			
			System.out.println("This number is not a prime number ! ");
			return; // return kullanarak > Diğer döngülerin çalışmasını durdurduk.
			
			//Main bloğunu direkt olarak bitirmemize yardımcı oldu.
			
			/*Eğer kullanmasaydık hem "This number is not a prime number" hemde  "This number is a prime number" yazdıracaktı. */
		}
		
		
		
		for(int i = 2;i<number;i++) 
		{
		
			if(number%i == 0) {
			 meter=1;	//System.out.println("This number is a prime number ! ");
			}
			
		}
		
		if(meter==1)
		{
			
			System.out.println("This number is a prime number !");
		}
		else {
			System.out.println("This number is not a prime number ! ");
		}
	}

}
