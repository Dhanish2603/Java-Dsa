package Day_5;
import java.util.Arrays;

public class permutation_1{
    public static void main(String[] args) {
        int []arr = {1,4,2,0,3};
         buildArray(arr);
    }
        static void buildArray(int[] nums) {
            int []arr = new int[nums.length];
            for(int n:nums){
                arr[n] = nums[nums[n]];
            }
            System.out.println(Arrays.toString(arr));
        }
   
}