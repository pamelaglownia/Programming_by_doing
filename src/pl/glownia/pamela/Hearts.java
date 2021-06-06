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
    static ArrayList<Card> stack;

    public static void main(String[] args) {
        stack = new ArrayList<>();
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

        System.out.println("Player 1, see your cards:");
        prepareUserDeck(userDeckPlayerOne, additionalDeckFour);
        System.out.println("Player 2, see your cards:");
        prepareUserDeck(userDeckPlayerTwo, additionalDeckOne);
        System.out.println("Player 3, see your cards:");
        prepareUserDeck(userDeckPlayerThree, additionalDeckTwo);
        System.out.println("Player 4, see your cards:");
        prepareUserDeck(userDeckPlayerFour, additionalDeckThree);

        while (stack.size() < 52) {
            System.out.println("Player 1");
            playAGame(userDeckPlayerOne);
            System.out.println("Player 2");
            playAGame(userDeckPlayerTwo);
            System.out.println("Player 3");
            playAGame(userDeckPlayerThree);
            System.out.println("Player 4");
            playAGame(userDeckPlayerFour);
        }
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

    public static void prepareUserDeck(ArrayList<Card> userDeck, ArrayList<Card> additionalDeck) {
        userDeck.addAll(additionalDeck);
        System.out.println(userDeck);
    }

    public static void playAGame(ArrayList<Card> userDeck) {
        Scanner scan = new Scanner(System.in);
        boolean correctTurn = false;
        do {
            System.out.println("Put suitable card. If you don't have put any card: ");
            System.out.print("\tSuit: ");
            String suit = scan.next();
            System.out.print("\tRank: ");
            String rank = scan.next();
            for (int i = 0; i < userDeck.size(); i++) {
                if (userDeck.get(i).suit.equalsIgnoreCase(suit) && userDeck.get(i).rank.equalsIgnoreCase(rank)) {
                    stack.add(userDeck.remove(i));
                    correctTurn = true;
                }
            }
        } while (!correctTurn);
        System.out.println(stack);
    }

    public static int countPoints(ArrayList<Card> userDeck) {
        int points = 0;
        for (int i = 0; i < userDeck.size(); i++) {
            if (userDeck.get(i).suit.equalsIgnoreCase("hearts")) {
                points += 1;
            }
            if (userDeck.get(i).suit.equalsIgnoreCase("spades") && userDeck.get(i).rank.equalsIgnoreCase("queen")) {
                points += 13;
            }
        }
        return points;
    }
}