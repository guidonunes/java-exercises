package Part9.InterfaceInABox;

import java.util.ArrayList;


public class Box implements Packable {
    private ArrayList <Packable> items;
    private double maximumCapacity;
   ;

    public Box(double maximumCapacity) {
        this.items = new ArrayList<>();
        this.maximumCapacity = maximumCapacity;

    }

    @Override
    public double weight() {
        double weight = 0;
        for (Packable item : this.items) {
            weight += item.weight();
        }
        return weight;
    }

    public void add(Packable item) {
        if (item.weight() + weight() <= this.maximumCapacity) {
            this.items.add(item);
        } else {
            System.out.println("Exceeds maximum capacity");
        }
    }

    public int totalItems() {
        return this.items.size();
    }

    @Override
    public String toString() {
        return "Box: " + totalItems() + " items, " + "total weight " + weight() + " kg";
    }
}
