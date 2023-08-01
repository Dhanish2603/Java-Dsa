package Day_7;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicateAll_5 {
    public List<Integer> findDuplicates(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i]-1;
            if ( arr[i] != arr[correct]) {
                swap(arr, i , correct);
            } else {
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        // search for first missing number
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index+1) {
                // return arr[index];
                ans.add(arr[index]);
            }
        }

        // case 2
        return ans;
    }
      

    public void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
