package Answers;

import java.util.Scanner;

public class Fibonnaci_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter range of fibbonaci:");
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        System.out.print("\n"+a);
        for(int i=0;i<n-1;i++){//n-1 because we have already printed a
            System.out.print(" "+b);
            int temp = a;
            a=b;
            b+=temp;
        }
        
        in.close();
        return;
    }
}
