import javax.swing.JOptionPane;

public class StopLightSwitch {
	public static void main(String[] args)
	{
		int currentColor = Integer.parseInt(JOptionPane.showInputDialog("Enter a color code:"));
		
		switch (currentColor)
		{
		case 1:
			JOptionPane.showMessageDialog(null,  "Next Traffic Light is green");
			break;
		case 2:
			JOptionPane.showMessageDialog(null,  "Next Traffic Light is yellow");
			break;
		case 3:
			JOptionPane.showMessageDialog(null,  "Next Traffic Light is red");
			break;
		default:
			JOptionPane.showMessageDialog(null,  "Invalid color");
		}
	}
}
