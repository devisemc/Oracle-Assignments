import java.util.Random;
public class Game {
	private double cost;
	
	void randomTicket(Card card)
	{
		Random rand = new Random();
		int winnings = rand.nextInt(1000);
		if (card.getCredit() < cost)
			System.out.println("Insufficient credits. Credits: " + card.getCredit() + ". Cost: " + cost);
		else
		{
			card.setCredit(card.getCredit() - cost);
			card.setTickets(card.getTickets() + winnings);
			
			System.out.println("Card Number: " + card.getNum());
			System.out.println("Tickets Won: " + winnings);
			System.out.println("New Ticket Amount: " + card.getTickets());
		}
	}
	void setCost(double newCost)
	{
		this.cost = newCost;
	}
}
