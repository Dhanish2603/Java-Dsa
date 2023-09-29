package Practice.Arrays.Answers;
import java.util.Arrays;

public class product_8 {
    public static void main(String[] args) {
        int[] nums = { 0,0};
        int[] product = productExceptSelf(nums);
        System.out.println(Arrays.toString(product));
    }

        public static int[] productExceptSelf(int[] nums) {
            int sum = 1;
             int count = 0;
             boolean isZero = false;
              for (int i = 0; i < nums.length; i++) {
                  if (nums[i] == 0) {
                      isZero = true;
                     count++;
                      if(count >1){
                          isZero= false;
                          sum = 0;
                          break;
                      }
                  } else
                      sum = sum * nums[i];
      
              }
              if(count >1){
                  sum = 0;
                  return new int[nums.length];
              }
      
              for (int i = 0; i < nums.length; i++) {
                  if (nums[i] != 0) {
                      if (isZero)
                          nums[i] = 0;
                      else {
                          nums[i] = sum / nums[i];
                      }
                  } else {
                      nums[i] = sum;
                  }
      
              }
              return nums;
          }

}