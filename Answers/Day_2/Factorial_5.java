package Day_2;

import java.util.Scanner;

public class Factorial_5 {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        System.out.println("Enter number");
        int n = in.nextInt();
        int factorial = 1;
        for(int i = n;i>0;i--){
            factorial *=i;
        }
        System.out.println("factorial is:"+factorial);
        in.close();
        return;
    }
}
