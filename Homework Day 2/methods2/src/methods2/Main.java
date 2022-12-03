package methods2;

import javax.sql.rowset.JoinRowSet;

public class Main {

	public static void main(String[] args) {

		String message = "The weather so nice today ";
		String newMessageString = giveCity();
		System.out.println(newMessageString);
		int number = addition(5, 7);
		System.out.println(number);
		int additNum = addition2(5, 87, 9, 9, 6, 4);
		System.out.println(additNum);

	}

	// Void operasyonları emir kipi gibi düşünülür.

	public static void add() {

		System.out.println("Added !");

	}

	public static void delete() {

		System.out.println("Deleted");

	}

	public static void update() {

		System.out.println("Updated");

	}

	public static int addition(int num1, int num2) {
		return num1 + num2;
	}

	public static String giveCity() {
		return "Ankara";
	}

	public static int addition2(int... numbers) 
	
	//Veriable Arguments yapısı ile parametreye birden çok değişken alabildik | Üç nokta ifadesiyle kullanılır
	
	{
		int total = 0;
		for (int number : numbers) {
			total += number;
		}
		return total;
	}

}
