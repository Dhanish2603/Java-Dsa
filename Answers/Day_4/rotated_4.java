package Day_4;

public class rotated_4 {
    public static void main(String[] args) {
        int []arr = {4,5,6,0,1,2,3};
       int ans = search(arr, 0);
       System.out.println(ans);
    }


        static int search(int[] nums, int target) {
           int start = 0;
           int end = nums.length-1;
           int mid;
           while(start<=end){
                mid = (start+end)/2;
               if(nums[mid]== target){
                   return mid;
               }
    
               if(nums[start] <=nums[mid] ){
                if (nums[start] <= target && nums[mid] >= target) {
                   end = mid-1;
                }
               else{
                   start = mid+1;
               }
               }
           else{
               if(nums[end]>=target && nums[mid] <=target){
                   start = mid+1;
               }else{
                   end = mid-1;
               }
           }
           
        }
           return -1;
        
    }
}
