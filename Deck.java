// Deck.java

import java.util.*;

public class Deck {
    private ArrayList<Card> deck;

    // Constructor to create a new deck
    public Deck() {
        deck = new ArrayList<>();
        createDeck();
    }

    // Method to create a deck of 52 cards
    public void createDeck() {
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};

        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(new Card(rank, suit));
            }
        }
    }

    // Method to print the entire deck
    public void printDeck() {
        for (Card card : deck) {
            System.out.println(card);
        }
    }
// Method to print a specific card
    public void printCard(int index) {
        if (index >= 0 && index < deck.size()) {
            System.out.println(deck.get(index));
        } else {
            System.out.println("Invalid card index.");
        }
    }

 // Method to check if two cards belong to the same suit
    public boolean sameCard(Card c1, Card c2) {
        return c1.getSuit().equals(c2.getSuit());
    }

    // Method to check if two cards have the same rank
    public boolean compareCard(Card c1, Card c2) {
        return c1.getRank().equals(c2.getRank());
    }

    // Method to find and print a specific card
    public void findCard(String rank, String suit) {
        for (Card card : deck) {
            if (card.getRank().equals(rank) && card.getSuit().equals(suit)) {
                System.out.println("Card found: " + card);
                return;
            }
        }
        System.out.println("Card not found.");
    }

   // Method to deal 5 random cards
    public void dealCard() {
        Collections.shuffle(deck);
        System.out.println("Dealt 5 random cards:");
        for (int i = 0; i < 5; i++) {
            System.out.println(deck.get(i));
        }
    }

    // Method to shuffle the deck
    public void shuffleDeck() {
        Collections.shuffle(deck);
        System.out.println("Deck shuffled.");
    }
}
