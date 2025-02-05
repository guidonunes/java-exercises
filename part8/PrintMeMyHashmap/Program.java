package PrintMeMyHashmap;


import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        // Test your program here!
        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("f.e", "for example");
        hashmap.put("etc.", "and so on");
        hashmap.put("i.e", "more precisely");

        printKeys(hashmap);
        System.out.println("---");
        printKeysWhere(hashmap, "f");
        System.out.println("---");
        printValuesOfKeysWhere(hashmap, ".e");
    }


    public static void printKeys(HashMap<String, String> hashmap) {
        for(HashMap.Entry<String, String> key : hashmap.entrySet()) {
            System.out.println(key.getKey());
        }

    }

    public static void printKeysWhere(HashMap<String, String> hashmap, String text) {
        for(HashMap.Entry<String, String> key : hashmap.entrySet()) {
            if (key.getKey().contains(text)) {
                System.out.println(key.getKey());
            }
        }
    }

    public static void printValuesOfKeysWhere(HashMap<String, String> hashmap, String text) {
        for(HashMap.Entry<String, String> value : hashmap.entrySet()) {
            if (value.getKey().contains(text)) {
                System.out.println(value.getValue());
            }
        }
    }
}
