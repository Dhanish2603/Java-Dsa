package Practice.Arrays.Answers;
import java.util.Arrays;

public class create_target_5 {
    public static void main(String[] args) {
        int[] arr = {  1};
        int[] index = { 0};
        int[] create = target(arr, index);
        System.out.println(Arrays.toString(create));
    }

    static int[] target(int[] arr, int[] index) {
        int n = arr.length;
        int[] target = new int[n];
        for (int i = 0; i < n; i++) {
            int[] temp = new int[i+1];
            for(int j = 0;j<temp.length;j++){
                if(j<index[i]){
                    temp[j] = target[j];
                }
                else if(j == index[i]){
                    temp[index[i]] = arr[i];
                    
                }else{
                    temp[j] = target[j-1];
                }
            }

            target = temp;
        }
        return target;

    }
}
