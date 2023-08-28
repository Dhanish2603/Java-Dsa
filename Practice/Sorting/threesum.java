import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threesum {
    public static void main(String[] args) {
        int arr[] = { -1, 0, 1, 2, -1, -4 };
        // int arr[] = {0,0,0 };

        System.out.println(findSum(arr).toString());
    }
//online solution
    class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            List<List<Integer>> ans = new ArrayList<>();
    
            // Sort the array
            Arrays.sort(nums);
    
            for (int i = 0; i < nums.length - 2; i++) {
                // Skip duplicate elements for i
                if (i > 0 && nums[i] == nums[i - 1]) {
                    continue;
                }
    
                int j = i + 1;
                int k = nums.length - 1;
    
                while (j < k) {
                    int sum = nums[i] + nums[j] + nums[k];
    
                    if (sum == 0) {
                        // Found a triplet with zero sum
                        ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
    
                        // Skip duplicate elements for j
                        while (j < k && nums[j] == nums[j + 1]) {
                            j++;
                        }
    
                        // Skip duplicate elements for k
                        while (j < k && nums[k] == nums[k - 1]) {
                            k--;
                        }
    
                        // Move the pointers
                        j++;
                        k--;
                    } else if (sum < 0) {
                        // Sum is less than zero, increment j to increase the sum
                        j++;
                    } else {
                        // Sum is greater than zero, decrement k to decrease the sum
                        k--;
                    }
                }
            }
            return ans;
        }
    }

//my logic
    public static List<List<Integer>> findSum(int[] arr) {
        List<List<Integer>> parent = new ArrayList<>();
        Arrays.sort(arr);
        int i = 0;
        while (i < arr.length - 2) {
            int j = i + 1;
            int k = arr.length - 1;
            while (j < k) {
                int sum = arr[i] + arr[j] + arr[k];

                if (j >= k) {
                    break;
                }
                if (sum == 0) {
                    List<Integer> child = new ArrayList<>();
                    child.add(arr[i]);
                    child.add(arr[j]);
                    child.add(arr[k]);
                    if (!parent.contains(child))
                        parent.add(child);
                    j++;
                    k--;
                }
                if (sum > 0) {
                    k--;
                }
                if (sum < 0) {
                    j++;
                }
            }
            i++;
        }
        // System.out.println(parent.toString());
        return parent;
    }
}