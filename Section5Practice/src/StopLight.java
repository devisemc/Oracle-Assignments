import javax.swing.JOptionPane;

public class StopLight {
	public static void main(String[] args)
	{
		int currentColor = Integer.parseInt(JOptionPane.showInputDialog("Enter a color code:"));
		
		if (currentColor == 1)
			JOptionPane.showMessageDialog(null,  "Next Traffic Light is green");
		else if (currentColor == 2)
			JOptionPane.showMessageDialog(null, "Next Traffic Light is yellow");
		else if (currentColor == 3)
			JOptionPane.showMessageDialog(null, "Next Traffic Light is red");
		else
			JOptionPane.showMessageDialog(null, "Invalid color");
	}
}
