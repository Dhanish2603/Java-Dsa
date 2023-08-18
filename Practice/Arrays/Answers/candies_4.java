import java.util.ArrayList;
import java.util.List;

public class candies_4 {
    class Solution {
    public List<Boolean> kidsWithCandies(int[] arr, int extraCandies) {
        List<Boolean> lst = new ArrayList<>(arr.length);
    int max = 0;
        for(int i =0;i<arr.length;i++){
            max = arr[i]>=max?arr[i]:max;
        }

        for(int i =0;i<arr.length;i++){
           if(arr[i]+extraCandies >=max){
               lst.add(true);
           }
           else{
               lst.add(false);
           }
        }
        return lst;
    }
}
}
