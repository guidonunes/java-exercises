package part6.Longest;


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

    public String longest() {
        if(this.elements.isEmpty()) {
            return null;
        }

        String longestWord = this.elements.get(0);

        for(String longest : this.elements) {
            if(longestWord.length() < longest.length()) {
                longestWord = longest;
            }
        }

        return longestWord;
    }

}
