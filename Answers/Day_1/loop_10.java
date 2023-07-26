package Day_1;

import java.util.Scanner;

public class loop_10 {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        System.out.println("enter number: ");
        int n = in.nextInt();
        for(int i=n-1;i>=0;i--){
            for(int j = 0;j<n;j++){
                if(i<=j){
                    System.out.print(n-i+" ");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
        
        in.close();
        return;
    }
}
