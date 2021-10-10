package deckofcards;

public class Players {
	private String name;
	private Card[] cards = new Card[9];

	Players(String name) {
		this.name = name;
	}

	void showPlayerCards() {
		System.out.println("---------------------------------------------");
		for (Card card : cards) {
			System.out.printf("%s of %s\n", card.rank, card.suit);
		}
		System.out.println("---------------------------------------------");
	}

	void receiveCard(Card card, int position) {
		cards[position] = card;
	}

	String getName() {
		return name;
	}
}