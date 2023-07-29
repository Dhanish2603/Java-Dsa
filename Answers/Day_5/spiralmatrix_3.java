package Day_5;

import java.util.ArrayList;
import java.util.List;

public class spiralmatrix_3 {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        spiralOrder(arr);
    }

    static void spiralOrder(int[][] matrix) {
        List<Integer> arr = new ArrayList<>();
        if (matrix == null || matrix.length == 0) {
            System.out.println("not matrix");
            return;
        }
        int rows = matrix.length;
        int cols = matrix[0].length;
        int top = 0;
        int bottom = rows - 1;
        int left = 0;
        int right = cols - 1;
        while (left <= right && top <= bottom) {
            for (int i = left; i <= right; i++) {
                arr.add(matrix[top][i]);
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                arr.add(matrix[i][right]);
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    arr.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    arr.add(matrix[i][left]);
                }
                left++;
            }
        }
        System.out.println(arr);
    }
}
