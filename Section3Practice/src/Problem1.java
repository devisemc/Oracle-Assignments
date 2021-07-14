import javax.swing.JOptionPane;

public class Problem1 {
	public static void main(String[] args)
	{
		double price = 0;
		
		//Get Customer's Name
		String name = JOptionPane.showInputDialog("What is your name?");
		int choice = JOptionPane.showConfirmDialog(null, name + ", do I have that correct?", "Name Confirmation", JOptionPane.YES_NO_OPTION);//no = 1, yes = 0
		while (choice != 0)
		{
			name = JOptionPane.showInputDialog("What is your name?");
			choice = JOptionPane.showConfirmDialog(null, name + ", do I have that correct?", "Name Confirmation", JOptionPane.YES_NO_OPTION);
		}
		
		JOptionPane.showMessageDialog(null,  "Hello, " + name + ", and welcome to Subway. We are pleased to have you here today.");
		
		//Get Number of Sandwiches
		int count = Integer.parseInt(JOptionPane.showInputDialog("How many sandwiches would you like?"));
		
		for (int sandwich = 1; sandwich < count+1; sandwich++)
		{
			//Get Bread Choice
			Object[] breads = {"Wheat Bread", "White Bread", "Italian Bread"};
			int bread = JOptionPane.showOptionDialog(null,  "What bread would you like for sandwich " + sandwich + "?", "Bread", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, breads, breads[0]);
			
			switch(bread)
			{
			case 0:
				JOptionPane.showMessageDialog(null,  "Alright, I'll get the Wheat Bread ready for you.");
				price += 2;
				break;
			case 1:
				JOptionPane.showMessageDialog(null,  "Alright, I'll get the White Bread ready for you.");
				price += 2.5;
				break;
			case 2:
				JOptionPane.showMessageDialog(null,  "Alright, I'll get the Italian Bread ready for you.");
				price += 3.5;
			}
			//Get Meat Choice
			Object[] meats = {"Turkey", "Roast Beef", "Bacon"};
			int meat = JOptionPane.showOptionDialog(null,  "What meat would you like for sandwich " + sandwich + "?", "Bread", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, meats, meats[0]);
			
			switch(meat)
			{
			case 0:
				JOptionPane.showMessageDialog(null,  "Alright, I'll get the Turkey ready for you.");
				price += 2;
				break;
			case 1:
				JOptionPane.showMessageDialog(null,  "Alright, I'll get the Roast Beef ready for you.");
				price += 2.5;
				break;
			case 2:
				JOptionPane.showMessageDialog(null,  "Alright, I'll get the Bacon ready for you.");
				price += 3.5;
			}
		}
		double money = Double.parseDouble(JOptionPane.showInputDialog("Price: $" + price + ". Please enter how much payment you will give in dollars, change will be automatically calculated."));
		JOptionPane.showMessageDialog(null,  "Here's your change, $" + Double.toString(money-price) + ". Thank you for shopping with us today at Subway! Have a great day.");
	}
}
