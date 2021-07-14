
public class Terminal {
	void creditPurchase(int money, Card card)
	{
		card.setCredit(card.getCredit() + (money * 2));
	}
	void checkBalance(Card card)
	{
		System.out.println("Card " + card.getNum() + " Credit: " + card.getCredit());
	}
	void transferTickets(Card card1, Card card2, double out1, double out2)
	{
		//out1
		card1.setTickets(card1.getTickets() - (int)out1);
		card2.setTickets(card2.getTickets() + (int)out1);
		
		//out2
		card2.setTickets(card2.getTickets() - (int)out2);
		card1.setTickets(card1.getTickets() + (int)out2);

		System.out.println("Card " + card1.getNum() + " Tickets: " + card1.getTickets());
		System.out.println("Card " + card2.getNum() + " Tickets: " + card2.getTickets());
	}
	void transferCredit(Card card1, Card card2, double out1, double out2)
	{
		//out1
		card1.setCredit(card1.getCredit() - out1);
		card2.setCredit(card2.getCredit() + out1);
		
		//out2
		card2.setCredit(card2.getCredit() - out2);
		card1.setCredit(card1.getCredit() + out2);
		
		System.out.println("Card " + card1.getNum() + " Credit: " + card1.getCredit());
		System.out.println("Card " + card2.getNum() + " Credit: " + card2.getCredit());
	}
	void prizePurchase(Card card, Prize prize)
	{
		if (prize.getCost() > card.getTickets())
			System.out.println("Insufficient Funds. Prize Cost: " + prize.getCost() + ". Card Tickets: " + card.getTickets());
		else if (prize.getQuantity() < 1)
			System.out.println("Out of prizes of that type.");
		else
		{
			prize.setQuantity(prize.getQuantity() - 1);
			card.setTickets(card.getTickets() - prize.getCost());
			
			System.out.println("Prize received. Amount of prize remaining: " + prize.getQuantity());
		}
		
	}
}
