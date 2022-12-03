package miniProjeSayiBulma;

public class Main {

	public static void main(String[] args) {
		
		int[] numbers = new int[] {1,2,5,7,9,0};
		int searchnum = 2 ;
		boolean isThereNum = false;
		
		for(int number:numbers) {
			if(number == searchnum) {
				isThereNum=true;
				break;
			}
		}
		
		System.out.println("Status of the number : ");
		
		if(isThereNum == true)
		{
			System.out.println("> Number available");
		}
		else {
			System.out.println("> Number not available");
		}
		
		
	}

}
