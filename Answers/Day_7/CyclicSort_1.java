package Day_7;

import java.util.Arrays;

public class CyclicSort_1{
    public static void main(String[] args) {
        int []arr = {3,4,2,1,0};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclic(int []arr){
        int i =0;
        while(i<arr.length){
            int correct = arr[i] ;
            if(arr[i]!=arr[correct]){
                int temp = arr[correct];
                arr[correct] = arr[i];
                arr[i] = temp;
            }
            else{
                i++;
            }
        }
     

    }
}