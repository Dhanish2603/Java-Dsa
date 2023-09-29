package Practice.Sorting.Answers;

import java.util.Arrays;


public class evensorting{
    public static void main(String[] args) {
        int []arr = {0,1};
        sortArrayByParity(arr);
        System.out.println(Arrays.toString(arr));
    }

    public  static void sortArrayByParity(int[] arr) {
        int i =0;
            int j = arr.length-1;
           
            while( i<j ){
    
                if(arr[i]%2==0){
                    i++;       
                }
                if(arr[j]%2==1){
                    j--;
                }
    
                if(i<j && arr[i]%2==1 && arr[j]%2==0){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                    j--;
                    i++;
                }
            }

        }
}