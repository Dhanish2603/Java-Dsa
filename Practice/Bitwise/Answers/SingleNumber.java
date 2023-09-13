package Practice.Bitwise.Answers;

public class SingleNumber {
    public static void main(String[] args) {
        int arr[] = {2,2,1};
        findnum(arr);

    }

    private static void findnum(int[] arr) {
        int unique = 0;
        for(int i =0;i<arr.length;i++){
            unique^=arr[i];
        }
        System.out.println(unique);
    }
}
