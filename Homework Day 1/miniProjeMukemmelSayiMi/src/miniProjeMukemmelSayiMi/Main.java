package miniProjeMukemmelSayiMi;

public class Main {

	public static void main(String[] args) {
		
		
		// 6 > 1+2+3 > Kendisi hariç tüm bölenlerinin toplamı kendisine eşit olan sayılara mükemmel sayı denir.
		
		int number = 189 ;
		
		int total=0;
		
		int meter=1;
		
		for(int i = 1 ; i<number ; i++)
		{
			if(number%i == 0)
			{
				total += i ;
				System.out.println("Dividing("+meter+") -> "+i);
				meter++;
			}
			
		}
		
		
		
		System.out.println("---------------------");
		
		
		System.out.println("Total value : "+total);
		
		System.out.println("Your number : "+number);
		
		System.out.println("Status of the number : ");
		
		System.out.println("---------------------");
		
		if(total == number) {
			System.out.println("This number is a perfect number");
		}
		else {
			System.out.println("This number is not a perfect number");
		}
		

	}

}
