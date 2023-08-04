package Day_10;

public class linearsearch_2 {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,6};
        System.out.println(helper(arr, 0, 15));

    }
    public static boolean helper(int []arr,int index,int target){
        if(index==arr.length ){
            return false;
            // return helper(arr, index+1, target)
        }
        
        return arr[index]==target || helper(arr, index+1, target);
    }
}
