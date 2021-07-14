import java.lang.Math;
import java.util.Random;

public class ComputeMethods {
	public double fToC(double degreesF) 
	{
		return ((5.0/9.0) * (degreesF-32));
	}
	public double hypotenuse(int a, int b)
	{
		return Math.sqrt(a*a + b*b);
	}
	public int roll()
	{
		Random rand = new Random();
		return (rand.nextInt(6) + rand.nextInt(6) + 2);
	}
}
