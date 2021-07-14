
public class TestClass {
	public static void main(String[] args)
	{
		ComputeMethods tester = new ComputeMethods();
		
		System.out.println("Temp in celsius is " + tester.fToC(98.6));
		System.out.println("Hypotenuse is " + tester.hypotenuse(5,7));
		System.out.println("The sum of the dice values is " + tester.roll());
	}
}
