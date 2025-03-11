package Part11.Dictionary;

package dictionary;

public class Main {
    public static void main(String[] args) {
        SaveableDictionary dictionary = new SaveableDictionary("words.txt");
        dictionary.load();

        // Add some words
        dictionary.add("tietokone", "computer");
        dictionary.add("kissa", "cat");

        // Save the dictionary to the file
        boolean saved = dictionary.save();
        if (saved) {
            System.out.println("Dictionary saved successfully.");
        } else {
            System.out.println("Failed to save the dictionary.");
        }

    }
}
