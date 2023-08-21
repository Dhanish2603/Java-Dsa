import java.util.Arrays;

public class TwoSum_1{
    public static void main(String[] args) {
       int arr[] = {-1000,-1,0,1};
        TwoSum_1 obj = new TwoSum_1();
        
        System.out.println(Arrays.toString(obj.twoSum(arr, 1)));
    }

    public int[] twoSum(int[] num, int target) {
        
        int start = 0;
        int end = num.length-1;
        while(start<end){
            int mid = start + (end-start)/2;
            if(num[start] +num[end] == target){
                return new int[]{start+1,end+1};
            }

            if(num[start]+num[end]>target){
                end--;
            }
            if(num[start]+num[end]<target){
                start++;
            }

            
            
        }


        return new int[]{start+1,end+1 };
    }
}