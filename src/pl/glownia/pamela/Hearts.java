package pl.glownia.pamela;

class Card {
    String suit;
    String rank;

    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "suit: " + suit + ", rank: " + rank;
    }
}

public class Hearts {
    static Card[] deck;

    public static void main(String[] args) {
        deck = createDeck();
    }


    public static Card[] createDeck() {
        int idCard = 0;
        deck = new Card[52];
        String[] suit = {"clubs", "diamonds", "hearts", "spades"};
        String[] rank = {"ace", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen", "king"};
        for (int i = 0; i < suit.length; i++) {
            for (int j = 0; j < rank.length; j++) {
                deck[i] = new Card(suit[i], rank[j]);
                System.out.println(deck[i]);
                idCard++;
            }
        }
        return deck;
    }
}