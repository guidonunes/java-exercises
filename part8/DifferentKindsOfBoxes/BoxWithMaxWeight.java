package DifferentKindsOfBoxes;

import java.util.ArrayList;


public class BoxWithMaxWeight extends Box {
    private int maxWeight;
    private ArrayList<Item> items;

    public BoxWithMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        int totalWeight = 0;
        for(Item i : items) {
            totalWeight += i.getWeight();
        }

        if(totalWeight + item.getWeight() <= maxWeight) {
            items.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return items.contains(item);
    }
}
