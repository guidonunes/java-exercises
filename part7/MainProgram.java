package part7;

import java.util.Arrays;


public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {3, 2, 1};

        MainProgram.sort(numbers);
        System.out.println(Arrays.toString(numbers));

    }

    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int number : array) {
            if (smallest > number) {
                smallest = number;
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        if (array.length == 0) {
            return -1;
        }

        int index = 0;
        int min = array[index];

        for (int i = 0; i < array.length; i++) {
            if(array[i] <= min) {
                min = array[i];
                index = i;
            }
        }
        return index;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        if(table.length == 0 || startIndex >= table.length || startIndex < 0) {
            return -1;
        }

        int min = table[startIndex];
        int index = startIndex;

        for (int i = startIndex + 1; i < table.length; i++) {
            if(table[i] <= min) {
                min = table[i];
                index = i;
            }
        }

        return index;
    }

    public static void swap(int[] array, int index1, int index2) {
        int number1 = array[index1];
        int number2 = array[index2];

        array[index1] = number2;
        array[index2] = number1;
    }

    public static void sort(int[] array) {
        int smallest = 0;

        for (int i = 0; i < array.length; i++){
            for (int j = i + 1; j < array.length; j++) {
                if(array[i] > array[j]) {
                    smallest = array[j];
                    array[j] = array[i];
                    array[i] = smallest;
                }
            }
        }
    }
}
