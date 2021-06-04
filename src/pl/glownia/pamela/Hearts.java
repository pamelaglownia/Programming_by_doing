package pl.glownia.pamela;

import java.util.*;

class Card {
    String suit;
    String rank;

    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "suit: " + suit + ", rank: " + rank + "\n";
    }
}

public class Hearts {
    static ArrayList<Card> deck;

    public static void main(String[] args) {
        deck = shuffleCards();
    }

    public static ArrayList<Card> createDeck() {
        deck = new ArrayList<>();
        String[] suit = {"clubs", "diamonds", "hearts", "spades"};
        String[] rank = {"ace", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen", "king"};
        for (int i = 0; i < suit.length; i++) {
            for (int j = 0; j < rank.length; j++) {
                deck.add(new Card(suit[i], rank[j]));
            }
        }
        return deck;
    }

    public static ArrayList<Card> shuffleCards() {
        deck = createDeck();
        Collections.shuffle(deck);
        System.out.println(deck);
        return deck;
    }
}