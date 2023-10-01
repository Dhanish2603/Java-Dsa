package Practice.Stack_Queue.Answers;

import java.util.Stack;

public class next_greater {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.add(10);
        st.add(20);
        st.add(30);
        System.out.println(st.peek());
        System.out.println(st.toString());
    }
    class Solution {
        public int[] nextGreaterElement(int[] nums1, int[] nums2) {
            int[] ans = new int[nums1.length];
            for(int i = 0; i < nums1.length; i++){
                int max = -1;
                for(int j = 0; j < nums2.length; j++){
                    int index = j;
                    if(nums1[i] == nums2[j]){ // Found element in nums2 that matches current element in nums1
                        while(index != nums2.length){ // Iterate through remaining elements in nums2 to find next greater element
                            if(nums2[index] > nums1[i]){
                                max = nums2[index]; // Update max if we find a greater element
                                break;
                            }
                            index++;
                        }
                    }
                }
                ans[i] = max;
            }
            return ans;
        }
    }
}
