package Day_2;

import java.util.Scanner;

public class Swap_4 {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        System.out.println("Enter numbers");
        int n1 = in.nextInt();
        int n2 = in.nextInt();

        System.out.println("before swapping:" +n1 +" "+ n2);
        n1 = n1+n2;
        n2 = n1-n2;
        n1= n1-n2;
        System.out.println("after swapping:" +n1+" " + n2);
        in.close();
    }
}
