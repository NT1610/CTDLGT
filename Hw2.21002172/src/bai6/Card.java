package bai6;

import java.util.Arrays;
import java.util.List;

public class Card {
    private String rank;
    private String suit;
    final List<String> RANKS = Arrays.asList("A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K");
    final List<String> SUITS = Arrays.asList("Spades", "Hearts", "Diamonds", "Clubs");

    public Card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public String getRank() {
        return rank;
    }

    public String getSuit() {
        return suit;
    }

    public int indexRank() {
        return RANKS.indexOf(rank);
    }

    public int indexSuit() {
        return SUITS.indexOf(suit);
    }

    @Override
    public String toString() {
        return "{" +
                "rank='" + rank + '\'' +
                ", suit='" + suit + '\'' +
                '}';
    }
}
