package basic.selection_sort;

import java.util.Arrays;

public class SelectionSort {

    private static int[] selectionSort(int[] inputArray) {
        System.out.println(Arrays.toString(inputArray));
        for (int i = 0; i < inputArray.length; i++) {
            int min = inputArray[i];
            int minIndex = i;
            for (int j = i; j < inputArray.length; j++) {
                if (min > inputArray[j]) {
                    min = inputArray[j];
                    minIndex = j;
                }
            }
            if (min != inputArray[i]) {
                inputArray[minIndex] = inputArray[i];
                inputArray[i] = min;
            }
            System.out.println(Arrays.toString(inputArray));
        }
        return inputArray;
    }

    public static void main(String[] args) {
        int[] data = {9, 5, 1, 3, 4, 7, 6, 2, 8};
        System.out.println(Arrays.toString(SelectionSort.selectionSort(data)));
    }
}
