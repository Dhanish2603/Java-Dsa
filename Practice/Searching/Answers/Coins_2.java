public class Coins_2 {

    public static void main(String[] args) {
        int n = 1804289383;
        Coins_2 obj = new Coins_2();
        System.out.println(obj.arrangeCoins(n));
    }

    public int arrangeCoins(int n) {
       
            long i=0;
            for(i=1;i*(i+1)/2<=n;i++);
            return (int)i-1;
        }

}