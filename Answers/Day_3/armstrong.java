package Day_3;
import java.util.*;
public class armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n == isArmstrong(n))
        System.out.println("the number "+n+" is Armstrong");
        else
        System.out.println("the number"+n+" is not armstrong");
        in.close();
    }
    static int isArmstrong(int num){
        int ans = 0;
        while(num>0){
            ans += Math.pow(num%10, 3);
            num /=10;
        }
        return ans;
    }
}
