package part12.Hideout;

import java.util.ArrayList;
import java.util.Iterator;


public class Hideout<T> {
    ArrayList<T> toHide;

    public Hideout() {
        this.toHide = new ArrayList<>();
    }

    public void putIntoHideout(T toHide) {
        this.toHide.add(toHide);
    }

    public T takeFromHideout() {
        if(toHide.isEmpty()) {
            return null;
        }

        T object = toHide.iterator().next();
        toHide.remove(object);

        return object;

    }

    public boolean isInHideout() {
        for(T object : toHide) {
            if(toHide.contains(object)) {
                return true;
            }
        }
        return false;
    }
}
