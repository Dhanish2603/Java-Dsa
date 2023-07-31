package Day_3;
import java.util.*;
public class prime_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        isPrime(n);
        in.close();
    }   

    static void isPrime(int num ){
        for(int i = 3; i< Math.sqrt(num);i++){
            if ( num%i == 0) {
                System.out.println(num +" is not prime number");
                return;
            }
        }
        System.out.println(num + " is a prime number");
    }
}
