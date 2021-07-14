
public class Game {
	private int id;
	private Team team1;
	private Team team2;
	private int score1;
	private int score2;
	private int temp;
	
	//getters
	int getID()
	{
		return this.id;
	}
	Team getTeam1()
	{
		return this.team1;
	}
	Team getTeam2()
	{
		return this.team2;
	}
	int getScore1()
	{
		return this.score1;
	}
	int getScore2()
	{
		return this.score2;
	}
	int getTemp()
	{
		return this.temp;
	}
	
	//setters
	void setID(int newID) 
	{
		this.id = newID;
	}
	void setTeam1(Team newTeam1)
	{
		this.team1 = newTeam1;
	}
	void setTeam2(Team newTeam2)
	{
		this.team2 = newTeam2;
	}
	void setScore1(int newScore1)
	{
		this.score1 = newScore1;
	}
	void setScore2(int newScore2)
	{
		this.score2 = newScore2;
	}
	void setTemp(int newTemp)
	{
		this.temp = newTemp;
	}
}
