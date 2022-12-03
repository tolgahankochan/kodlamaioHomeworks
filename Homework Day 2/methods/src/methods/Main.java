package methods;

public class Main {

	public static void main(String[] args) {
		
		
		searchNumber();
		searchNumber();
		searchNumber();
		searchNumber();
		
		

	}

	public static void searchNumber() {
		
		//Fonksiyon yazarak kendimizi tekrarlamayı önlemiş oluyoruz.
		
		int[] numbers = new int[] {1,2,3,5,7,9,0};
		int searchnum = 7 ;
		boolean isThere=false;
		
		for(int number : numbers)
		{
			if(number==searchnum)
			{
			
				isThere=true;
			    break;

			}
			
			}
		
		String message="";
		if(isThere) {
			message="There is number: "+searchnum;
			sendMessage("There is number ! : "+searchnum);
		}
		else {
			sendMessage("There isn't number ! : "+searchnum);
		}
		
		
	}
	
	public static void sendMessage(String message){
		
		System.out.println(message);
		
	}
	
}
