package Day_1;

import java.util.Scanner;

public class LCM_HCF_4 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two nmber to check hcf and lcm:");

        int a =in.nextInt();
        int b =in.nextInt();
        int hcf = hcf(a,b);
        int lcm = (a*b)/hcf;
        System.out.println("lcm is "+lcm); 
        System.out.println("hcf is "+hcf); 
    
        in.close();
    }
   
    static int hcf(int a,  int b){
 
       if(a==0)
        return b;
       else
      return  hcf(b%a,a);
        
    }
}
