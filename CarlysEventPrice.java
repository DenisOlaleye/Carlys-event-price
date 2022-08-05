import java.util.Scanner;
import javax.swing.JOptionPane;

public class CarlysEventPrice 
{
	public static void main (String [] args)
	{
		Scanner input = new Scanner(System.in);
		
		int numberOfGuests, totalPrice;
		final int PRICE_PER_GUEST = 35;
		
		System.out.println("Enter number of guests >> ");
		numberOfGuests = input.nextInt();
		
		totalPrice = numberOfGuests*PRICE_PER_GUEST;
		
		boolean isLarge = (numberOfGuests>=50);
		
		System.out.println(	 "*************************************************\n"
			    +"*                                               *\n"
				+"* Carly's makes the food that makes it a party  *\n"
				+"*                                               *\n"
				+"*************************************************");
		
		System.out.println("Number of guests: " + numberOfGuests);
		System.out.println("Price per guest " +PRICE_PER_GUEST);
		System.out.println("Total price " +totalPrice);
		System.out.println("Is it large job? " +isLarge);
	}

}
