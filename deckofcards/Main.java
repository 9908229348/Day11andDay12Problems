package deckofcards;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Players[] players = new Players[4];
		Card[] deck = DeckOfCards.getDeckOfCards();

		System.out.println("Un-shuffled Cards.");
		DeckOfCards.showCards(deck);
		Card[] shuffledCards = DeckOfCards.shuffleCards(deck);
		System.out.println("Shuffled Cards.");
		DeckOfCards.showCards(shuffledCards);

		for (int i = 0; i < players.length; i++) {
			System.out.println("Enter Player Name: ");
			players[i] = new Players(scanner.nextLine());
		}

		Players[] playersWithCards = DeckOfCards.dealCards(players, shuffledCards);

		System.out.println("---------------------------------------------");

		for (Players player : playersWithCards) {
			System.out.println(player.getName());
			player.showPlayerCards();
		}

	}
}
