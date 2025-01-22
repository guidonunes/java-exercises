package part6.Stack;

import java.util.ArrayList;

public class Stack {
    private ArrayList<String> values;

    public Stack() {
        this.values = new ArrayList<>();
    }

    public void add(String value) {
        this.values.add(value);
    }

    public boolean isEmpty() {
        if(this.values.isEmpty()) {
            return true;
        }
        return false;
    }

    public String take() {
        if(!this.values.isEmpty()) {
            return this.values.remove(this.values.size()-1);
        }
        return null;
    }

    public ArrayList<String> values() {
        return this.values;

    }
}
