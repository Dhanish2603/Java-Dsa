package Practice.Sorting;

import java.util.ArrayList;
import java.util.List;

public class intersection2 {

    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    arr.add(nums1[i]);
                    nums2[j] = -1;
                    break;
                }
            }
        }

        int[] arr1 = new int[arr.size()];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr.get(i);
        }
        return arr1;
    }

}
