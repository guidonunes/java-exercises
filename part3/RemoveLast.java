package part3;


import java.util.ArrayList;

public class RemoveLast {
    public static void removeLast(ArrayList<String> values) {
        if (values.size() == 0){
            return;
        }

        int index = values.size() -1;
        values.remove(index);
    }

    public static void main(String[] args) {
        // Try your method in here
        ArrayList<String> strings = new ArrayList<>();

        strings.add("First");
        strings.add("Second");
        strings.add("Third");

        System.out.println(strings);
        removeLast(strings);

        System.out.println(strings);

        removeLast(strings);
        System.out.println(strings);

    }

}
