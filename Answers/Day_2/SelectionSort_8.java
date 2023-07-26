package Day_2;

import java.util.Arrays;

public class SelectionSort_8 {
    public static void main(String[] args) {
        int arr[] = { 20, 90, 10, 50, 60, 30 };
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }

            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
