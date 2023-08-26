package Practice.Sorting;
import java.util.Arrays;


public class intersection{

    public static void main(String[] args) {
        int nums1[] = {1,2,2,1};
        int nums2[] = {2};
        System.out.println(Arrays.toString(intersectionFind(nums1,nums2)));
    }

    public static int[] intersectionFind(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        System.out.println(n+" "+m);
        int i = 0;
        int j =0;
        while(i<n && j+1<m){
            // int count = 0;
            for(int k =0;k<n;k++){
                if(nums2[j] == nums1[k] && nums2[j+1] ==nums1[k+1]){
                    return new int[]{nums2[j],nums2[j+1]};
                }
                j++;
            }
        }
        return new int[]{-1};
    }
}