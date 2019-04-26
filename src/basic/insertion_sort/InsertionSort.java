package basic.insertion_sort;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] array = {9, 5, 1, 3, 4, 7, 6, 2, 8};
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            //j 表示当前比较的位置，如第一次i = 1 取出元素7，他需要与7这个元素之前的所有元素相比较，也就是循环 j
            for (int j = i; j > 0; j--) {
                //交换位置
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
            System.out.println(Arrays.toString(array));
        }
    }
}
