package Practice.Sorting;

public class maxelement {
    public int majorityElement(int[] nums) {
        int index = nums[0];
    for(int i =0;i<=nums.length/2;i++){
        int count = 0;
        for(int j=i+1;j<=nums.length-1;j++){
            if(nums[i] == nums[j]){
                count++;
            }
        }

        if(count >=nums.length/2){
             index = i;
            return nums[i];
        }
    }
    return nums[0];
}
}
