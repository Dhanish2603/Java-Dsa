package Day_2;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram_1 {
    static boolean isAnagram(String s1, String s2) {
        boolean status = true;
        if (s1.length() != s2.length())
            status = false;
        else {
            char[] c1 = s1.toLowerCase().toCharArray();
            char[] c2 = s2.toLowerCase().toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);
            status = Arrays.equals(c1, c2);
        }
        return status;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter string");
        String s1 = in.next();
        String s2 = in.next();
        boolean status = isAnagram(s1, s2);
        if (status)
            System.out.println("it is an anagram string");
        else
            System.out.println("it is not an anagram string");

        in.close();
    }
}