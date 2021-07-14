import javax.swing.JOptionPane;

public class Problem2 {
	public static void main(String[] args)
	{
		String name = JOptionPane.showInputDialog("What is your name?");
		String[] names = name.split(" ");
		System.out.println("Your name is: " + names[1] + ", " + names[0].charAt(0) + ".");
	}
}
