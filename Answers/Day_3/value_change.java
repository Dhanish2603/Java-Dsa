import java.util.Arrays;

public class value_change {
    public static void main(String[] args) {
        int []arr= {1,2,3,4,5};
        changeValue(arr);
        System.out.println(Arrays.toString(arr));// here the refernce of object is passed so value change
    }

    static void changeValue(int []p ){
        p[0] = 99;
    }
}
