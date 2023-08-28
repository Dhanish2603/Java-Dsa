// package Practice.Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class intersection {

    public static void main(String[] args) {
        int nums1[] = { 1, 2, 2, 1 };
        int nums2[] = { 2 };
        System.out.println(Arrays.toString(intersectionFind(nums1, nums2)));
    }

    public static int[] intersectionFind(int[] nums1, int[] nums2) {
        HashSet<Integer> s1 = new HashSet<>();
        HashSet<Integer> s2 = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            s1.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            s2.add(nums2[i]);
        }
        ArrayList<Integer> l = new ArrayList<>();
        for (int i : s1) {
            if (s2.contains(i)) {
                l.add(i);
            }
        }
        int r = l.size();
        int[] arr = new int[r];
        for (int i = 0; i < r; i++) {
            arr[i] = l.get(i);
        }
        return arr;

    }

}