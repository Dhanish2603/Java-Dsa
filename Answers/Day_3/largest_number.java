
import java.util.*;
// import java.lang.*;
public class largest_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter three numbers");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        // if(a>b && a>c){
        //     System.out.println("Largest Number is"+a);
        // }
        // if(b>a && b>c){
        //     System.out.println("Largest Number is "+b);
        // }
        // if(c>a && c>b){
        //     System.out.println("Largest Number is "+c);
        // }
        // if((a==b)&& (b==c)){
        //     System.out.println("all number are equal and value is "+a);
        // }

        //alternate one line 
            System.out.println("Largest NUmber is "+Math.max((Math.max(a,b)), c));
        in.close();
    }
}
