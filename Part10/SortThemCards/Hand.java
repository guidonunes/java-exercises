package Part10.SortThemCards;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;

public class Hand implements Comparable<Hand> {
    private List<Card> cards;

    public Hand() {
        this.cards = new ArrayList<>();
    }

    public void add(Card card) {
        this.cards.add(card);
    }

    public void print() {
        Iterator<Card> iterator = this.cards.iterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void sort() {
        Collections.sort(this.cards);
    }

    private int getHandValue() {
        int sum = 0;
        for(Card card : cards) {
            sum += card.getValue();
        }
        return sum;
    }

    @Override
    public int compareTo(Hand otherHand) {
        return this.getHandValue() - otherHand.getHandValue();
    }


  public void sortBySuit() {
        Collections.sort(this.cards, new BySuitInValueOrder());
    }
}
