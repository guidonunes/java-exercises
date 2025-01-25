package part6.TodoList;

import java.util.ArrayList;


public class TodoList {
   private ArrayList<String> list;


    public TodoList() {
        this.list = new ArrayList<>();
    }

    public void add(String task) {
        this.list.add(task);
    }

    public void print() {
        int index = 0;
        for(String task : list) {
            index++;
            System.out.println(index + ": " + task);
        }
    }

    public void remove(int number) {
        this.list.remove(number - 1);

    }
}
