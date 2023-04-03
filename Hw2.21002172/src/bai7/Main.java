package bai7;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DeckCard deckCard = new DeckCard();
        List<Card> cards = deckCard.getCards();

        CompareCard compareCard = new CompareCard();
        cards.sort(compareCard);
        deckCard.shuffle();
        List<Card> cards2 = deckCard.getCards();

    }
}
