package Practice.Recursion.Answers;

import java.util.Arrays;

public class sumtriangle {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        sum(arr, arr.length);
    }

    public static void sum(int[] arr, int n) {
        if (n <= 1) {
            return;
        }
        
        int[] latest = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            latest[i] = arr[i] + arr[i + 1];
        }
        sum(latest, --n);
        System.out.println(Arrays.toString(latest));

    }
}
