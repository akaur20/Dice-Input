/*
 * Avleen Kaur Period 7
 */
import java.util.Scanner;

public class DiceInput 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		Dice dice1 = new Dice();
		Dice dice2 = new Dice();
		
		System.out.print("Please enter a number between 2 and 12: ");
		int target = Integer.parseInt(in.next());
		
		while (target < 2 || target > 12 )
		{
			System.out.print("You did not type a valid number. Please enter a number between 2 and 12: ");
		    target = Integer.parseInt(in.next());
		}
		
		int diceOne = dice1.roll();
		int diceTwo = dice2.roll();
		int sum = diceOne + diceTwo;
		System.out.println("Dice One's Roll: " + diceOne);
		System.out.println("Dice Two's Roll: " + diceTwo);
		System.out.println("Sum of Two Die: " + sum);
		
		while (diceOne + diceTwo != target)
		{
			diceOne = dice1.roll();
			diceTwo = dice2.roll();
			sum = diceOne + diceTwo;
			System.out.println("Dice One's Roll: " + diceOne);
			System.out.println("Dice Two's Roll: " + diceTwo);
			System.out.println("Sum of Two Die: " + sum);
		}
		
		System.out.print("It took " + dice1.getRoll() + " rolls to get your target number.");

	}

}
