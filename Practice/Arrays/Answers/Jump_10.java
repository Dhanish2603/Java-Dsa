import java.util.Arrays;

public class Jump_10 {
    public static void main(String[] args) {
        int nums[] = { 0, 1 };
        boolean value = canJump(nums);
        System.out.println(value);
    }

    public static boolean canJump(int[] nums) {
        int reachable = 0;
        for(int i = 0; i < nums.length; i ++) {
            if(i > reachable) return false;
            reachable = Math.max(reachable, i + nums[i]);
        } 
        return true;
    }
}
