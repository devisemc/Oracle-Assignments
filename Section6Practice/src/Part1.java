import java.util.Scanner;

public class Part1 {
	public static void main(String[] args)
	{
		final int PIN = 9848;
		
		Scanner inputVar = new Scanner(System.in);
		System.out.println("Enter PIN: ");
		int pinGuess = inputVar.nextInt();
		
		while(pinGuess != PIN)
		{
			System.out.println("Invalid PIN, try again: ");
			pinGuess = inputVar.nextInt();
		}
		
		System.out.println("Access Granted. PIN was: " + PIN);
	}
}
