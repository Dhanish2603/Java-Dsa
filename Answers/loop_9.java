package Answers;

import java.util.Scanner;

public class loop_9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter number: ");
        int n = in.nextInt();
        for(int i = 2*n;i>0;i--){
            if(i>=n){   
            for(int j =n;j<2*n;j++){
                if(j<i)
                System.out.print(" ");
                else
                System.out.print("* ");
            }
            
            
        }
        else{
                for(int j = n;j>0;j--){
                    if(j<=i){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
        
        in.close();
        return;
    }
}
