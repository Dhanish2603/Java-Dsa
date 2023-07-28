package Day_4;

import java.util.Arrays;

public class chocolate_3 {
    public static void main(String[] args) {
        int []arr = {12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50};
        int m = 20;
        Arrays.sort(arr);
        int sum = Integer.MAX_VALUE;
        if(arr.length<m){
            System.out.println("not possible");
        }
        else{
        for(int i =0;i<arr.length-m+1;i++){
            if(arr[i+m-1]-arr[i]<sum){
                sum = arr[i+m-1]-arr[i];
            }
        }
        }
        System.out.println(sum);
    }
}
