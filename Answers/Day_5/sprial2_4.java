package Day_5;

import java.util.Arrays;

public class sprial2_4 {
    public static void main(String[] args) {
        // int [][]num = new int[3][3];
        generateMatrix(3);
        // System.out.println(Arrays.toString(num));
    }
        static void  generateMatrix(int num) {
            int [][] arr = new int[num][num];
            int left = 0;
            int right = num-1;
            int top=0;
            int bottom = num-1;
            if (num == 0) {
                return ;
            }
            int n=1;
            while(top<=bottom && left <= right){
                for(int i=left; i<=right;i++){
                    arr[top][i]=n;
                    n++;
                }
                top++;
                for(int i=top;i<=bottom;i++){
                    arr[i][right] =n;
                    n++;
                }
                right--;
                if(top<=bottom){
                    for(int i =right;i>=left;i--){
                        arr[bottom][i] = n;
                        n++;
                    }
                    bottom--;
                }
                if(left<=right){
                    for(int i=bottom;i>=top;i--){
                        arr[i][left]=n;
                        n++;
                    }
                    left++;
                }
            }
            System.out.println(Arrays.toString(arr));
        }
}
