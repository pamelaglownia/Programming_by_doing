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
        System.out.println("Player 1, your cards:");
        ArrayList<Card> userDeckPlayerOne = dealCardsForPlayers();
        ArrayList<Card> additionalDeckOne = passThreeCardsToNextPlayer(userDeckPlayerOne);
        deletePassedCards(userDeckPlayerOne, additionalDeckOne);
        System.out.println("Player 2, your cards:");
        ArrayList<Card> userDeckPlayerTwo = dealCardsForPlayers();
        ArrayList<Card> additionalDeckTwo = passThreeCardsToNextPlayer(userDeckPlayerTwo);
        deletePassedCards(userDeckPlayerTwo, additionalDeckTwo);

        System.out.println("Player 3, your cards:");
        ArrayList<Card> userDeckPlayerThree = dealCardsForPlayers();
        ArrayList<Card> additionalDeckThree = passThreeCardsToNextPlayer(userDeckPlayerThree);
        deletePassedCards(userDeckPlayerThree, additionalDeckThree);
        System.out.println("Player 4, your cards:");
        ArrayList<Card> userDeckPlayerFour = dealCardsForPlayers();
        ArrayList<Card> additionalDeckFour = passThreeCardsToNextPlayer(userDeckPlayerFour);
        deletePassedCards(userDeckPlayerFour, additionalDeckFour);

        System.out.println("Player 1:");
        userDeckPlayerOne = prepareUserDeck(userDeckPlayerOne, additionalDeckFour);
        System.out.println("Player 2:");
        userDeckPlayerTwo = prepareUserDeck(userDeckPlayerTwo, additionalDeckOne);
        System.out.println("Player 3:");
        userDeckPlayerThree = prepareUserDeck(userDeckPlayerThree, additionalDeckTwo);
        System.out.println("Player 4:");
        userDeckPlayerFour = prepareUserDeck(userDeckPlayerFour, additionalDeckThree);

    }

    public static ArrayList<Card> createDeck() {
        deck = new ArrayList<>();
        String[] suit = {"clubs", "diamonds", "hearts", "spades"};
        String[] rank = {"ace", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen", "king"};
        for (String s : suit) {
            for (String r : rank) {
                deck.add(new Card(s, r));
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

    public static ArrayList<Card> passThreeCardsToNextPlayer(ArrayList<Card> userDeck) {
        Scanner scan = new Scanner(System.in);
        int chosenCards = 0;
        ArrayList<Card> additionalUserDeck = new ArrayList<>();
        System.out.println(userDeck);
        System.out.println("\nChoose three cards to pass to next player.");
        do {
            System.out.println(chosenCards + 1 + ":");
            System.out.print("\tSuit: ");
            String suit = scan.next();
            System.out.print("\tRank: ");
            String rank = scan.next();
            for (int i = 0; i < userDeck.size(); i++) {
                if (userDeck.get(i).suit.equalsIgnoreCase(suit) && userDeck.get(i).rank.equalsIgnoreCase(rank)) {
                    additionalUserDeck.add(userDeck.remove(i));
                    chosenCards++;
                }
            }
        } while (chosenCards < 3);
        System.out.println("You passed cards: " + additionalUserDeck);
        return additionalUserDeck;
    }

    public static void deletePassedCards(ArrayList<Card> userDeck, ArrayList<Card> additionalDeck) {
        userDeck.removeAll(additionalDeck);
    }

    public static ArrayList<Card> prepareUserDeck(ArrayList<Card> userDeck, ArrayList<Card> additionalDeck) {
        userDeck.addAll(additionalDeck);
        System.out.println(userDeck);
        return userDeck;
    }
}