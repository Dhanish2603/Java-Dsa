package Day_2;

import java.util.Arrays;
import java.util.Scanner;

public class Palindrome_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter string");
        String s1 = in.next();
        char []c = s1.toCharArray();
        char[] s2 =new char[c.length];
        for(int i = c.length-1;i>=0;i--){
            s2[c.length-1-i] = c[i];
        }
        if(Arrays.equals(c, s2)){
            System.out.println("the given string is palindrome");
        }
        else{
            System.out.println("the given string is not palindrome");
        }
        in.close();
        return;
    }
}
