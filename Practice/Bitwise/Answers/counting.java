package Practice.Bitwise.Answers;
 
import java.util.Arrays;

public class counting {
    public static void main(String[] args) {
        
        System.out.println(Arrays.toString(countingvalue(5)));
    }

//alternate
    public class Solution {
        public int[] countBits(int n) {
            int[] ans = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                ans[i] = ans[i >> 1] + (i & 1);
            }
            return ans;
        }
    }

    private static int[] countingvalue(int n) {
        int [] arr = new int[n+1];
        for(int i =0;i<arr.length;i++){
            arr[i] = hammingWeight(i);
        }
        return arr;
    }
    public static int hammingWeight(int n) {
        int ones = 0;
            while(n!=0) {
                ones = ones + (n & 1);
                n = n>>>1;
            }
            return ones;
    }
}
