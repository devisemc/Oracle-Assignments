
public class DateNight {
	public static void main(String[] args)
	{
		//Instantiate Cards
		Card card1 = new Card();
		card1.setNum(1);
		Card card2 = new Card();
		card2.setNum(2);
		
		//Instantiate Game
		Game randomTicketGame = new Game();
		randomTicketGame.setCost(3);
		
		//Instantiate Terminal
		Terminal terminal = new Terminal();
		
		//Instantiate Prizes
		Prize console = new Prize();
		console.setCost(20);
		console.setQuantity(5);
		
		Prize ring = new Prize();
		ring.setCost(10);
		ring.setQuantity(15);
		
		Prize candy = new Prize();
		candy.setCost(2);
		candy.setQuantity(30);
		
		//Load Credit
		card1.setCredit(20);
		card2.setCredit(25);
		
		//Play Game
		randomTicketGame.randomTicket(card1);
		randomTicketGame.randomTicket(card1);
		randomTicketGame.randomTicket(card1);
		randomTicketGame.randomTicket(card1);
		randomTicketGame.randomTicket(card2);
		randomTicketGame.randomTicket(card2);
		randomTicketGame.randomTicket(card2);
		randomTicketGame.randomTicket(card2);
		randomTicketGame.randomTicket(card2);
		
		//Transfer Credits from Card1 to Card2
		terminal.transferCredit(card1, card2, card1.getCredit(), 0);
		terminal.transferTickets(card1, card2, card1.getTickets(), 0);
		
		//Purchase Prizes
		terminal.prizePurchase(card2, console);
		terminal.prizePurchase(card2, ring);
		terminal.prizePurchase(card2, candy);
		
		//Error Testing
		randomTicketGame.randomTicket(card1);
		terminal.prizePurchase(card1, candy);
		card2.setCredit(2000);
		terminal.prizePurchase(card2, console);
		terminal.prizePurchase(card2, console);
		terminal.prizePurchase(card2, console);
		terminal.prizePurchase(card2, console);
		terminal.prizePurchase(card2, console);
		terminal.prizePurchase(card2, console);
	}
}
