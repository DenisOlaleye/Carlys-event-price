import java.util.Scanner;

public class CarlysEventPrice 
{
	public static void main (String [] args)
	{		
		int guestNum = setNumOfGuests();	
		displayMotto();
		computePrice(guestNum);		
	}
	
//		method that	prompts the user for the number of guests and returns the value to the main() method
	public static int setNumOfGuests()
	{
		int guests;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of guests >> ");
		guests = input.nextInt();
		input.close();
		return guests;
	}
	
//		method that displays the company motto with the border
	public static void displayMotto()
	{
		System.out.println(	 "*************************************************\n"
			    +"*                                               *\n"
				+"* Carly's makes the food that makes it a party  *\n"
				+"*                                               *\n"
				+"*************************************************");
	}
	
//	method that computes the price of the event, displays the price, and displays whether the event is a large event
	public static void computePrice(int guests)
	{
		
		int totalPrice;
		final int PRICE_PER_GUEST = 35;
		boolean isLarge = (guests >= 50);
		totalPrice = guests * PRICE_PER_GUEST;
		System.out.println();		
		System.out.println("Total price $" +totalPrice);
		System.out.println("Is it large job? " +isLarge);
	}
	
}
