package Day_2;


public class Array_min_6 {
    public static void main(String[] args) {
        
        System.out.println("Enter number");
        int a1[] = {40,20,10,50,90};
        int min = a1[0];
        for(int i = 0; i<a1.length;i++){
            if(min>a1[i])
            min = a1[i];
        }
        System.out.println("array minimum value is "+ min);
    }
}
