package part6.Suitcase;

import java.util.ArrayList;


public class Hold {
    private ArrayList<Suitcase> suitcases;
    private int weight;
    private int maxWeight;


    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.weight = 0;
        this.suitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        if (this.weight + suitcase.totalWeight() <= this.maxWeight) {
            this.suitcases.add(suitcase);
            this.weight += suitcase.totalWeight();
        }
    }

    public void printItems() {
        for(Suitcase suitcase : suitcases) {
            suitcase.printItems();
        }
    }

    public String toString() {
        return this.suitcases.size() + " suitcases " + "(" + this.weight + " kg" + ")";
    }
}
