import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class Season {
	static void shuffleArray(int[] ar)
	{
		Random rnd = new Random();
	    for (int i = ar.length - 1; i > 0; i--)
	    {
	      int index = rnd.nextInt(i + 1);
	      //swap
	      int a = ar[index];
	      ar[index] = ar[i];
	      ar[i] = a;
	    }
	}
	public static void main(String[] args)
	{
		//Initialize Teams and set Names
		Team team1 = new Team();
		team1.setName("Eagles");
		
		Team team2 = new Team();
		team2.setName("Pelicans");
		
		Team team3 = new Team();
		team3.setName("Penguins");
		
		Team team4 = new Team();
		team4.setName("Ravens");
		
		//Create Lists
		Team[] teams = {team1, team2, team3, team4};
		ArrayList<Game> games = new ArrayList<Game>();
		int[] index = {0, 1, 2, 3}; 
		

		
		//Initialize scanner and Needed Variables
		Scanner tempInput = new Scanner(System.in);
		int temp = 80;
		int daysFreezing = 0;
		Random rnd = new Random();
		
		//ASk for temperatures, compute games, until three freezing temperatures are entered in a row
		while (daysFreezing < 3)
		{
			
			while (true)
			{
				try
				{
					System.out.println("Enter Temperature: ");
					temp = tempInput.nextInt();
					break;
				}
				catch(Exception e)
				{
					System.out.println("Invalid Input, please try again.");
					tempInput.nextLine();
				}
			}
			
			
			if (temp <= 32)
			{
				System.out.println("Too cold to play.");
				daysFreezing++;
				continue;
			}
			else
			{
				shuffleArray(index);
				//play 2 games
				//choose 2 random teams
				int j;
				Game game1 = new Game();
				game1.setID(games.size());
				
				j = rnd.nextInt(temp/10);
				teams[index[0]].setGoals(teams[index[0]].getGoals() + j);
				teams[index[1]].setGoalsAllowed(teams[index[1]].getGoalsAllowed() + j);
				game1.setScore1(j);
				
				j = rnd.nextInt(temp/10);
				teams[index[1]].setGoals(teams[index[1]].getGoals() + j);
				teams[index[0]].setGoalsAllowed(teams[index[0]].getGoalsAllowed() + j);
				game1.setScore2(j);
				
				game1.setTeam1(teams[index[0]]);
				game1.setTeam2(teams[index[1]]);
				game1.setTemp(temp);
				
				if (game1.getScore1() > game1.getScore2())
				{
					teams[index[0]].setWins(teams[index[0]].getWins() + 1);
					teams[index[1]].setLosses(teams[index[1]].getLosses() + 1);
				}
				else if (game1.getScore1() < game1.getScore2())
				{
					teams[index[1]].setWins(teams[index[1]].getWins() + 1);
					teams[index[0]].setLosses(teams[index[0]].getLosses() + 1);
				}
				else
				{
					teams[index[0]].setTies(teams[index[0]].getTies() + 1);
					teams[index[1]].setTies(teams[index[1]].getTies() + 1);
				}
				
				games.add(game1);
				
				Game game2 = new Game();
				game2.setID(games.size());
				
				j = rnd.nextInt(temp/10);
				teams[index[2]].setGoals(teams[index[2]].getGoals() + j);
				teams[index[3]].setGoalsAllowed(teams[index[3]].getGoalsAllowed() + j);
				game2.setScore1(j);
				
				j = rnd.nextInt(temp/10);
				teams[index[2]].setGoals(teams[index[2]].getGoals() + j);
				teams[index[3]].setGoalsAllowed(teams[index[3]].getGoalsAllowed() + j);
				game2.setScore2(j);
				
				game2.setTeam1(teams[index[2]]);
				game2.setTeam2(teams[index[3]]);
				game2.setTemp(temp);
				
				if (game2.getScore1() > game2.getScore2())
				{
					teams[index[2]].setWins(teams[index[2]].getWins() + 1);
					teams[index[3]].setLosses(teams[index[3]].getLosses() + 1);
				}
				else if (game2.getScore1() < game2.getScore2())
				{
					teams[index[2]].setWins(teams[index[2]].getWins() + 1);
					teams[index[3]].setLosses(teams[index[3]].getLosses() + 1);
				}
				else
				{
					teams[index[2]].setTies(teams[index[2]].getTies() + 1);
					teams[index[3]].setTies(teams[index[3]].getTies() + 1);
				}
				
				games.add(game2);
				
				daysFreezing = 0;
			}
		}
		System.out.println("Season over.");
		for (int i = 0; i < 4; i++)
		{
			System.out.println(teams[i].getName());
			System.out.println("Wins: " + teams[i].getWins() + ", Losses: " + teams[i].getLosses() + ", Ties: " + teams[i].getTies());
			System.out.println("Points Scored: " + teams[i].getGoals() + ", Points Allowed: " + teams[i].getGoalsAllowed());
			System.out.println();
		}
		for (int i = 0; i < games.size(); i++)
		{
			System.out.println("Game #" + (games.get(i).getID() + 1));
			System.out.println("Temperature: " + games.get(i).getTemp());
			System.out.println("Away Team: " + games.get(i).getTeam1().getName() + ", " + games.get(i).getScore1());
			System.out.println("Home Team: " + games.get(i).getTeam2().getName() + ", " + games.get(i).getScore2());
		}
	}
}
