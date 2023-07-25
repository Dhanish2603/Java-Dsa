package Answers;

import java.util.Scanner;

public class loop_8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter number: ");
        int n = in.nextInt();
        for(int i = 0;i<2*n;i++){
            if(i<=n-1){
            for(int j = 0;j<=i;j++){
                System.out.print("* ");
            }
        }
        else{
            for(int j = 2*n-2;j>=i;j--){
                System.out.print("* ");
            }
        }
          System.out.println();
        }
        
        in.close();
        return;
    }
}
