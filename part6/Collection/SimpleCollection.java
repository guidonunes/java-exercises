package part6.Collection;


import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;


    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    @Override
    public String toString() {
        String printOutput = "The collection " + this.name + " is empty.";

        if(elements.isEmpty()) {
            return printOutput;
        }

        String listElements = "";
        int count = elements.size();


        if (count == 1) {
            listElements = elements.get(0);
            return "The collection " + this.name + " has " + count + " element:\n" + listElements;
        } else {
            for(String element : elements) {
            listElements += element + "\n";

            }
        }

        return "The collection " + this.name + " has " + count + " elements:\n" + listElements +"\n";

    }
}
