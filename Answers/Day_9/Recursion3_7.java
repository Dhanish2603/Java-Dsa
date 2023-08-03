package Day_9;

public class Recursion3_7 {
 public static void main(String[] args) {
    // sumDigit(5);
    System.out.println(sumDigit(54312));
 }  
 public static int sumDigit(int n){
    if(n<=0)
    return 0;
    return n%10+sumDigit(n/10);
 } 
}
