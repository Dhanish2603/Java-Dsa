package Day_2;

import java.util.Arrays;

public class insertionsosrt_9 {
    public static void main(String[] args) {
        int arr[] = { 90,60,50,30,20,10 };
        for (int i = 1; i < arr.length; i++) {

            for (int j = i; j >0; j--) {
                if(arr[j-1]>arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
                // System.out.println(Arrays.toString(arr));
            }
            
        }
        System.out.println(Arrays.toString(arr));
    }
}
