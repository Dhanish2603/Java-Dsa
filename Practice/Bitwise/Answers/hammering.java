package Practice.Bitwise.Answers;

public class hammering {
    public static void main(String[] args) {
        int x =  1;
        int y = 4;
         while(x>0 && y >0){
            x = 1<<x;
            y = 1<<y;
            System.out.println(x);
         }
    }
}
