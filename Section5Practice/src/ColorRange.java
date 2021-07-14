import javax.swing.JOptionPane;

public class ColorRange {
	public static void main(String[] args)
	{
		double wavelength = Double.parseDouble(JOptionPane.showInputDialog("Enter a color code:"));
		
		if (380 <= wavelength && wavelength < 450)
			JOptionPane.showMessageDialog(null,  "The color is Violet");
		else if (450 <= wavelength && wavelength < 495)
			JOptionPane.showMessageDialog(null,  "The color is Blue");
		else if (495 <= wavelength && wavelength < 570)
			JOptionPane.showMessageDialog(null,  "The color is Green");
		else if (570 <= wavelength && wavelength < 590)
			JOptionPane.showMessageDialog(null,  "The color is Yellow");
		else if (590 <= wavelength && wavelength < 620)
			JOptionPane.showMessageDialog(null,  "The color is Orange");
		else if (620 <= wavelength && wavelength < 750)
			JOptionPane.showMessageDialog(null,  "The color is Red");
		else
			JOptionPane.showMessageDialog(null,  "The entered wavelength is not a part of the visible spectrum");
	}
}
