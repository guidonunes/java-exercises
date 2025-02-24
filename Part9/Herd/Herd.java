package Part9.Herd;

import java.util.ArrayList;
import java.util.List;

public class Herd implements Movable {
    private List<Movable> movables;

    public Herd() {
        this.movables = new ArrayList<>();
    }

   @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Movable movable : movables) {
            sb.append(movable.toString()).append("\n");
        }
        return sb.toString().trim();
    }


    public void addToHerd(Movable movable) {
        if (movable != null) {
            this.movables.add(movable);
        }
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable movable : movables) {
            movable.move(dx, dy);
        }
    }
}
