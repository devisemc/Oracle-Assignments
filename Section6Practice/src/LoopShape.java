
public class LoopShape {
	static char icon = '#';
	static void createRectangle(int width, int height)
	{
		String base = "";
		for (int col = 0; col < width; col++)//run for first and last
		{
			base += icon;
		}
		
		String mid = "";
		for (int col = 0; col < width; col++)
		{
			if (col == 0 || col == width - 1)
				mid += icon;
			else
				mid += ' ';
		}
		
		for (int row = 0; row < height; row++)
		{
			if (row == 0 || row == height - 1)
				System.out.println(base);
			else
				System.out.println(mid);
		}
	}
	static void createTriangle(int leg)
	{
		String line = "";
		for (int row = 1; row < leg + 1; row++)
		{
			for (int i = 0; i < row; i++)
			{
				if (row == leg || i == 0 || i == row - 1)//runs if first or last column, fills entire row if it is last row
					line += icon;
				else
					line += ' ';
			}
			System.out.println(line);
			line = "";
		}
	}
	public static void main(String[] args)
	{
		createRectangle(4, 5);
		System.out.println();
		createTriangle(5);
		
	}
}
