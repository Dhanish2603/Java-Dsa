// package intro to java_01;
package Day_3;
import java.util.*;
public class temp_convert {
    public static void main(String[] args) {
        // float f = in.nextFloat();
        // float c = in.nextFloat();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1:For Farehnit to Celsius");
        System.out.println("Enter 2:For Celsius to Farehnit");
        int num = in.nextInt();
        if(num == 1){
            System.out.println("enter farehnit value");
            float f = in.nextFloat();
            float ans =(float)(((f-32)*5)/9);
            System.out.println("Conversion is "+ans );
        }
        else if(num ==2){
            System.out.println("enter Celsius value");
            float c = in.nextFloat();
            System.out.println("Conversion is "+ (float)((c*(9/5))+32));
        }
        in.close();
    }
}
