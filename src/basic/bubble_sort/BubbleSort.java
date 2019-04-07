package basic.bubble_sort;

import java.util.Arrays;

public class BubbleSort {

    private static int[] bubbleSort(int[] inputArray) {
        System.out.println(Arrays.toString(inputArray));
        for (int i = 0; i < inputArray.length; i++) {
            boolean change = true;
            for (int j = 1; j < inputArray.length - i; j++) {
                if (inputArray[j] < inputArray[j - 1]) {
                    int temp = inputArray[j];
                    inputArray[j] = inputArray[j - 1];
                    inputArray[j - 1] = temp;
                    change = false;
                }
            }
            if (change) {
                break;
            }
            System.out.println(Arrays.toString(inputArray));
        }
        return inputArray;
    }

    public static void main(String[] args) {
        int[] data = {9, 5, 1, 3, 4, 7, 6, 2, 8};
        System.out.println(Arrays.toString(BubbleSort.bubbleSort(data)));
    }
}
