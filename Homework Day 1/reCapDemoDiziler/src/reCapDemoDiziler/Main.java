package reCapDemoDiziler;

public class Main {

	public static void main(String[] args) {
		
		
		//double[]mylist = new double[4]; şeklindede yazılabilir.
		
		double[]mylist = {1.5,1.8,2.8,6.5,9.5,2.1};
		double total = 0 ;
		double maxValue = mylist[0];
		
		for(double number:mylist)
		{
			if(maxValue<number)
			{
				maxValue = number;
			}
			
			
			System.out.println(number);
			total += number;
		}
		System.out.println("+-------");
		System.out.println("TOTAL : "+total);
		System.out.println("MAX VALUE : "+maxValue);
		

	}

}
