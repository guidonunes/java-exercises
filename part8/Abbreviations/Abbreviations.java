package Abbreviations;

import java.util.HashMap;

public class Abbreviations {
    private HashMap<String, String> abbreviation;

    public Abbreviations() {
        this.abbreviation = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        this.abbreviation.put(abbreviation, explanation);
    }

   public boolean hasAbbreviation(String abbreviation) {
       if(this.abbreviation.containsKey(abbreviation)) {
           return true;
       }
       return false;
    }

   public String findExplanationFor(String abbreviation) {
       if(this.hasAbbreviation(abbreviation)) {
           return this.abbreviation.get(abbreviation);
       } else {
           return null;
       }
   }

}
