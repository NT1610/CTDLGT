package bai7;

import java.util.Comparator;

public class CompareCard implements Comparator<Card> {
    @Override
    public int compare(Card o1, Card o2) {

        if (o1.indexSuit() == o2.indexSuit()) {
            if (o1.indexRank() > o2.indexRank()) {
                return 1;
            } else if (o1.indexRank() < o2.indexRank()) {
                return -1;
            }

        } else if (o1.indexSuit() < o2.indexSuit()) {
            if (o1.indexRank() > o2.indexRank()) {
                return 1;
            } else if (o1.indexRank() == o2.indexRank()) {
                return 1;
            } else {
                return -1;
            }

        } else {
            if (o1.indexRank() > o2.indexRank()) {
                return 1;
            } else if (o1.indexRank() == o2.indexRank()) {
                return -1;
            } else {
                return -1;
            }
        }

        return 0;
    }
}
