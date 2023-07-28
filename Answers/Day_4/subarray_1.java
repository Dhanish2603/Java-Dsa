package Day_4;

public class subarray_1 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        maxSubArray(arr);
    }
// this is method to find total sum that an array can possibly have

    
       static int maxSubArray(int[] nums) {
            int sum =Integer.MIN_VALUE;
            int curr = 0;
            for(int i=0; i<nums.length; i++){
                curr += nums[i];
                 if(curr > sum)
                    sum = curr;
                if(curr<0)
                    curr = 0;
               
            }
            return sum;
        }
    
}
