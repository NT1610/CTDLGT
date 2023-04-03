package bai6;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DeckCard deckCard = new DeckCard();
        List<Card> cards = deckCard.getCards();

        CompareCard compareCard = new CompareCard();
        cards.sort(compareCard);

        for (Card card : cards) {
            System.out.println(card);
        }
    }
}
