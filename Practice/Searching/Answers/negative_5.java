public class negative_5 {

    public static void main(String[] args) {
        int grid[][] = { { 3, -1, -3, -3, -3 }, { 2, -2, -3, -3, -3 }, { 1, -2, -3, -3, -3 }, { 0, -3, -3, -3, -3 } };
        negative_5 obj = new negative_5();

        System.out.println(obj.countNegatives(grid));

    }

    public int lastPositive(int[] ar) {
        int n = ar.length;
        int i = 0, j = n - 1;
        while (i <= j) {
            int mid = i + (j - i) / 2;
            if (ar[mid] < 0)
                j = mid - 1;
            else
                i = mid + 1;
        }
        return i;
    }

    public int countNegatives(int[][] grid) {
        int sum = 0;
        for (int[] ar : grid) {
            int n = ar.length;
            int ans = lastPositive(ar);
            if (n - ans != -1)
                sum += n - ans;
        }
        return sum;
    }
}
