import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // insert test code here
        String[] array = {"banana", "apple", "cherry", "date"};

        Main.sort(array);
        System.out.println(Arrays.toString(array));
    }


    public static void sort(int[] array) {
        Arrays.sort(array);
    }


    public static void sort(String[] array) {
        Arrays.sort(array);
    }

    public static void sortIntegers(ArrayList<Integer> integers) {
        Collections.sort(integers);
    }

    public static void sortStrings(ArrayList<String> strings) {
        Collections.sort(strings);
    }
}
