package Day_9;

public class Recursion2_6 {
    public static void main(String[] args) {

        System.out.println(product(5 ));
        System.out.println(sum(5 ));
    }
    public static int product(int n){
        if(n<=1)
        return 1;
    
        return n*product(n-1);
    }
    public static int sum(int n){
        if(n<=1)
        return 1;
    
        return n+sum(n-1);
    }
}
