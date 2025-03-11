package Part11.Dictionary;


package dictionary;

import java.util.HashMap;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors




public class SaveableDictionary {
    private HashMap<String, String> translations;
    private String file;

    public SaveableDictionary() {
        this.translations = new HashMap<>();
    }

    public SaveableDictionary(String file){
        this();
        this.file = file;
    }

    public void add(String word, String translation) {
        if(!this.translations.containsKey(word) && !this.translations.containsKey(translation)) {
            this.translations.put(word, translation);
            this.translations.put(translation, word);
        }
    }

    public String translate(String word) {
        return this.translations.getOrDefault(word, null);
    }

    public void delete(String word) {
        if(this.translations.containsKey(word)) {
            String translation = this.translations.get(word);

            this.translations.remove(word);
            this.translations.remove(translation);
        }
    }

    public boolean load() {
        try (Scanner fileReader = new Scanner(new File(this.file))) {
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = line.split(":");

                if (parts.length == 2) {
                    String word = parts[0].trim();
                    String translation = parts[1].trim();
                    this.add(word, translation);
                }
            }
            return true;
        } catch (FileNotFoundException e) {
            return false;
        }

    }

    public boolean save() {
        try(FileWriter writer = new FileWriter(this.file)) {
            java.util.HashSet<String> savedPairs = new java.util.HashSet<>();

            for(HashMap.Entry<String, String> entry : this.translations.entrySet()) {
                String word = entry.getKey();
                String translation = entry.getValue();

                if(!savedPairs.contains(word) && !savedPairs.contains(translation)) {
                    writer.write(word + ":" + translation + "\n");
                    savedPairs.add(word);
                    savedPairs.add(translation);
                }
            }
            return true;
        } catch(IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}
