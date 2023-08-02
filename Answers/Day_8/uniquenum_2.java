package Day_8;

public class uniquenum_2 {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,2,4,5,3,1};
        System.out.println(ans(arr));
    }
    public static int ans(int[]arr){
        int unique=0;
        for(int i :arr){
            unique ^=i;
            System.out.println(unique);
        }
        return unique;
    }
}
