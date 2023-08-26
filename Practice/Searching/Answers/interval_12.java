import java.util.Arrays;

public class interval_12 {

    public static void main(String[] args) {
        // int [][]arr = {{1,2}};
        int [][]arr = {{4,4}};
        // int[][] arr = { { 3, 4 }, { 2, 3 }, { 1, 2 } };
        // int[][] arr = { { 1, 4 }, { 2, 3 }, { 3, 4 } };
        // int[][] arr = { { 1, 2 }, { 2, 3 }, { 0, 1 }, { 3, 4 } };

        System.out.println(Arrays.toString(findRightInterval(arr)));
    }

    public static int[] findRightInterval(int[][] intervals) {
        int n = intervals.length;
        // int m = intervals[0].length;
        
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            int end = intervals[i][1];
            int value = Integer.MIN_VALUE;
            int count = 0;
            for (int j = 0; j < n; j++) {
                int start = intervals[j][0];
                if (start >= end) {
                    if (count > 0) {
                        if(intervals[value][0] > start)
                        value = j;
                    }else{
                        value = j;
                        arr[i] = value;
                        count++;
                    }
                }
            }
            if (value >= 0) {
                arr[i] = value;
            } else {
                arr[i] = -1;

            }
        }

        return arr;
    }
}
