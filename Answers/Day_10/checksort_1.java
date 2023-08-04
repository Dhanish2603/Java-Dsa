package Day_10;
public class checksort_1{
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,0};
        System.out.println(helper(arr,0));
    }

    public static boolean helper(int []arr,int index){
        if(index == arr.length-1){
            return true;
        }
        if(index<arr.length-1 && arr[index]<arr[index+1]){
            return helper(arr, index+1);
        }
       
            return false;
            

        // return true; 
        
    }
}