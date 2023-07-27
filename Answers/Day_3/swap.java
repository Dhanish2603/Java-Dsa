

public class swap {
    static void swapper(int a, int b){
        int temp = a;
        a = b;
        b = temp; 
        System.out.println(a+" "+b);
    }
    public static void main(String[] args) {
        int a = 10;
        int b =20;
        swapper(a,b);
        System.out.println(a+" "+b);//values are not changed
    }

   
}
