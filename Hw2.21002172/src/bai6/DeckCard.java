package bai6;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DeckCard {
    private List<Card> cards;
    String[] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};

    public DeckCard() {
        cards = new ArrayList<>();
        for (String suit : suits) {
            for (String rank : ranks) {
                Card card = new Card(rank, suit);
                cards.add(card);
            }
        }
    }

    private static boolean exist(ArrayList<Integer> array, int number) {
        for (Integer integer : array) {
            if (number == integer) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<Integer> createRandom(int n, int m) {
        Random random = new Random();
        ArrayList<Integer> randomInt = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int ranNum = random.nextInt(m) + 1;
            if (!exist(randomInt, ranNum)) {
                randomInt.add(ranNum);
            }
        }
        return randomInt;
    }

    public void shuffle() {

        ArrayList<Integer> numbersRank = createRandom(13, 13);
        ArrayList<Integer> numbersSuit = createRandom(4, 4);
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                Card card = new Card(ranks[numbersRank.get(j)], suits[numbersSuit.get(i)]);
                cards.set(j, card);
            }
        }
        for (String suit : suits) {
            for (String rank : ranks) {
                Card card = new Card(rank, suit);
                cards.add(card);
            }
        }
    }

    public List<Card> getCards() {
        return cards;
    }

}
