import java.util.Scanner;

public class Part2 {
	public static void main(String[] args)
	{
		Scanner inputVar = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int num = inputVar.nextInt();
		
		for (int i = 1; i < 13; i++)
		{
			if (num % i == 0)
				System.out.println(i);
		}
	}
}
