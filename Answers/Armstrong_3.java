package Answers;

import java.util.Scanner;

public class Armstrong_3 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter number to check:");
            int n = in.nextInt();
            int b = 0;
            int temp = n;
           while(temp>0){
            b +=Math.pow(temp%10, 3); 
            temp/=10;
           }
           if(b ==n)
           System.out.println(n +" is and armstrong number");
           else
           System.out.println(n +" is not and armstrong number");
            in.close();
            return;
        }
}
