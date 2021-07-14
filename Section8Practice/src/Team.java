
public class Team {
	private String name;
	private int wins = 0;
	private int losses = 0;
	private int ties = 0;
	private int goals = 0;
	private int goalsAllowed = 0;
	
	//getters
	String getName()
	{
		return this.name;
	}
	int getWins()
	{
		return this.wins;
	}
	int getLosses()
	{
		return this.losses;
	}
	int getTies()
	{
		return this.ties;
	}
	int getGoals()
	{
		return this.goals;
	}
	int getGoalsAllowed()
	{
		return this.goalsAllowed;
	}
	
	
	//setters
	void setName(String newName)
	{
		this.name = newName;
	}
	void setWins(int newWins)
	{
		this.wins = newWins;
	}
	void setLosses(int newLosses)
	{
		this.losses = newLosses;
	}
	void setTies(int newTies)
	{
		this.ties = newTies;
	}
	void setGoals(int newGoals)
	{
		this.goals = newGoals;
	}
	void setGoalsAllowed(int newGoalsAllowed)
	{
		this.goalsAllowed = newGoalsAllowed;
	}
}
