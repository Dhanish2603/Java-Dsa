package Day_1;

import java.util.Scanner;

public class loop_7 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("enter number: ");
        int n = in.nextInt();
        for(int i = 0;i<n;i++){
            for(int j =0;j<i;j++){
                System.out.print(" ");
            }
            for(int j = i;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        in.close();
        return;
    }
}
