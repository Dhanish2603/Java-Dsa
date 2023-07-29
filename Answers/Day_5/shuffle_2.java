package Day_5;

import java.util.Arrays;

public class shuffle_2 {
    public static void main(String[] args) {
        int []arr = {1,4,3,2,5,6,9,8};
        shuffle(arr, 4);
    }
        static void shuffle(int[] nums, int n) {
         int []arr = new int[n*2];
         arr[0] = nums[0];
         arr[arr.length-1] = nums[nums.length-1];
        
         int j =0;
    
         for(int i =0;i<2*n-1;i+=2){
             arr[i] = nums[j];
             j++;
         }
         j=n;
         for(int i =1;i<2*n-1;i+=2){
             arr[i] = nums[j];
             j++;
         }
         System.out.println(Arrays.toString(arr));
        }
    
}
