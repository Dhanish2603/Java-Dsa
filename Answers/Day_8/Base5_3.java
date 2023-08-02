package Day_8;

public class Base5_3 {
    public static void main(String[] args) {
        int n = 5;

        int ans = 0;
        int base = 5;

        while (n > 0) {
            int last = n & 1;
            System.out.println(n);
            n = n >> 1;
            ans += last * base;
            base = base * 5;
        }

        System.out.println(ans);
    }
}
