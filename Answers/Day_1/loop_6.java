package Day_1;

import java.util.Scanner;

public class loop_6 {
    public static void main(String[] args) {
        
 
        Scanner in = new Scanner(System.in);
        System.out.println("enter number: ");
        int n = in.nextInt();
        for(int i =n;i>0;i--){
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= n - i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        
        
        in.close();
        return;
 }
}
