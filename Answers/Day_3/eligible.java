// package intro to java_01;
import java.util.*;
public class eligible {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of test case");
        int t = in.nextInt();
        while(t-->0){
            int age = in.nextInt();
            if(age> 17){
                System.out.println("eligible to Vote");
            }
            else{
                System.out.println("not eligible to Vote");
            }
        }
        in.close();
    }
}
