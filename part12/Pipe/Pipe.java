package part12.Pipe;

import java.util.ArrayList;



public class Pipe<T> {
    ArrayList<T> values;

    public Pipe() {
        this.values = new ArrayList<>();
    }

    public void putIntoPipe(T value){
        this.values.add(value);
    }

    public T takeFromPipe() {
        if(values.isEmpty()) {
            return null;
        }

        return values.remove(0);
    }

    public boolean isInPipe() {
        return !values.isEmpty();
    }
}
