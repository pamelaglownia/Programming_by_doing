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
        return "\nsuit: " + suit + ", rank: " + rank;
    }
}

public class Hearts {
    static ArrayList<Card> deck;

    public static void main(String[] args) {

        deck = shuffleCards();
        ArrayList<Card> userDeckPlayerOne = dealCardsForPlayers();
       ArrayList<Card> additionalDeck = passThreeCardsToNextPlayer(userDeckPlayerOne);
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
        return deck;
    }

    public static ArrayList<Card> dealCardsForPlayers() {
        Random random = new Random();
        ArrayList<Card> userDeck = new ArrayList<>();
        for (int cardsForUser = 0; cardsForUser < 13; cardsForUser++) {
            userDeck.add(deck.remove(random.nextInt(deck.size())));
        }
        return userDeck;
    }

    public static ArrayList<Card> passThreeCardsToNextPlayer(ArrayList<Card> userDeck){
        Scanner scan = new Scanner(System.in);
        int chosenCards= 0;
        ArrayList<Card>additionalUserDeck = new ArrayList<>();
        System.out.println("Your cards:" + userDeck);
        System.out.println("Choose three cards to pass to next player.");
        do {
            System.out.println(chosenCards +1 + ":");
            System.out.print("\tSuit: ");
            String suit = scan.next();
            System.out.print("\tRank: ");
            String rank = scan.next();
            for(int i = 0; i < userDeck.size(); i++){
            if(userDeck.get(i).suit.equalsIgnoreCase(suit) && userDeck.get(i).rank.equalsIgnoreCase(rank)){
                additionalUserDeck.add(userDeck.remove(i));
                chosenCards++;}
            }
        }while(chosenCards <3);
        System.out.println(additionalUserDeck);
        return additionalUserDeck;
    }
}