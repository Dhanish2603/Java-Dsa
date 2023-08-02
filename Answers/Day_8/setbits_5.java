package Day_8;

public class setbits_5{
    public static void main(String[] args) {
        int n = 18;
        System.out.println(Integer.toBinaryString(n));

        System.out.println(setBits(n));
    }

    private static int setBits(int n) {
        int count = 0;

//        while (n > 0) {
//            count++;
//            n -= (n & -n);
//        }

        while (n > 0) {
            count++;
            System.out.println(n);
            n = n & (n-1);
        }

        return count;
    }
}