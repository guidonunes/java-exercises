package Part10.SortThemCards;

import java.util.Comparator;

public class BySuitInValueOrder implements Comparator<Card> {
    public int compare(Card c1, Card c2) {
        // First compare by suit
        int suitComparison = c1.getSuit().ordinal() - c2.getSuit().ordinal();

        if (suitComparison != 0) {
            return suitComparison;
        }

        // Then compare by value within the same suit
        return c1.getValue() - c2.getValue();
    }
}
