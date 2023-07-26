package Day_2;

import java.util.Scanner;

public class Reverse_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number");
        int n = in.nextInt();
        int reverse = 0;
        while(n>0){
           reverse = reverse*10+ n%10;
           n/=10;
        }
        System.out.println("Reverse number is :"+reverse );

        in.close();
    }
}
