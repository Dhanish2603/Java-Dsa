package Day_1;
import java.util.Scanner;

public class LeapYear_1{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = in.nextInt();
        if(year%400==0)
        System.out.println(year+" is a leap year");
        else if(year%100 == 0)
            System.out.println(year +" is not a leap year");
            else if(year %4==0)
            System.out.println(year +" is a leap year");
            else
                System.out.println(year +" is a not leap year");
                in.close();
                return ;
        
    }
}
