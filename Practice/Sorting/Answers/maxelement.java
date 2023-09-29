package Practice.Sorting.Answers;

public class maxelement {
    public static void main(String[] args) {
        int num = majorityElement(new int[]{1,2,3,4,5});
        System.out.println(num);
    }
    public static int majorityElement(int[] nums) {
        int index = nums[0];
        System.out.println(index);
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
