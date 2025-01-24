package part6.Suitcase;

import java.util.ArrayList;


public class Suitcase {
    private ArrayList<Item> items;
    private int weight;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.weight = 0;
        this.maxWeight = maxWeight;
    }

    public void addItem(Item item) {
        if (this.weight + item.getWeight() <= this.maxWeight) {
            this.items.add(item);
            this.weight += item.getWeight();
        }
    }

    public void printItems() {
        for(Item item : items) {
            System.out.println(item);
        }
    }

    public int totalWeight() {
        int totalWeight = 0;

        for (Item item : items) {
            totalWeight += item.getWeight();
        }
        return totalWeight;
    }

    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }

        Item heaviestItem = this.items.get(0);

        for(Item item : items) {
            if(heaviestItem.getWeight() < item.getWeight()) {
                heaviestItem = item;
            }

        }

        return heaviestItem;
    }

    public String toString() {
        if(this.items.isEmpty()){
            return "no items " + "(" + this.weight + " kg" + ")";
        }

        if(this.items.size() == 1) {
            return this.items.size() + " item " + "(" + this.weight + " kg" +")";
        } else {
            return this.items.size() + " items " + "(" + this.weight + " kg" +")";
        }

    }
}
