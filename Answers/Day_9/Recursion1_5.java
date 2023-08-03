package Day_9;

public class Recursion1_5 {
    public static void main(String[] args) {
        num(5);
        revnum(5);
    }

    public static void num(int n){
        if(n==0){
            return;
        }
        num(n-1);
        System.out.println(n);
    }
    public static void revnum(int n) {
        if(n==0)
        return;
        System.out.println(n);
        revnum(n-1);
    }
}
