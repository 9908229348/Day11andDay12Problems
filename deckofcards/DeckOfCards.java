package deckofcards;

import java.util.Random;

public class DeckOfCards {
	private static final int SIZE = 36;
	private static Card[] deckOfCards = new Card[SIZE];

	static Card[] getDeckOfCards() {
		int count = 0;
		String[] suits = { "Diamonds", "Clubs", "Hearts" };
		String[] ranks = { "3", "4", "5", "6", "7", "8", "9", "10", "King", "Queen", "Jack", "Ace" };

		for (String s : suits) {
			for (String r : ranks) {

				Card card = new Card(s, r);
				deckOfCards[count] = card;
				count++;
			}
		}
		return deckOfCards;
	}

	static Card[] shuffleCards(Card[] deckOfCards) {
		Random rand = new Random();
		for (int i = 0; i < SIZE; i++) {
			int j = rand.nextInt(SIZE);
			Card temp = deckOfCards[i];
			deckOfCards[i] = deckOfCards[j];
			deckOfCards[j] = temp;
		}
		return deckOfCards;
	}

	static void showCards(Card[] deckOfCards) {
		System.out.println("---------------------------------------------");
		int count = 0;
		for (Card card : deckOfCards) {
			System.out.printf("%s of %s\t", card.rank, card.suit);
			count++;
			if (count % 4 == 0)
				System.out.println();
		}
		System.out.println("---------------------------------------------");
	}

	static Players[] dealCards(Players[] players, Card[] deck) {
		int numOfCardsPerPlayer = deck.length / players.length;
		for (int i = 0; i < deck.length; i++) {
			int positionInHand = i % numOfCardsPerPlayer;
			players[i % players.length].receiveCard(deck[i], positionInHand);
		}
		return players;
	}
}
