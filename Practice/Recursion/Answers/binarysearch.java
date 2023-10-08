package Practice.Recursion.Answers;

public class binarysearch {
    public static void main(String[] args) {
        
        int [] arr = {-1,0,3,5,9,12};
        search(arr,9);
    }

    public static void search(int[] arr, int target) {
        
        int ans = findTarget(arr,target,0,arr.length-1);
        System.out.println(ans);
    }
//search method
    private static int findTarget(int[] arr, int target, int s, int e) {
        int mid = s+(e-s)/2;
        if(s>e){
            return -1;
        }
        if(target == arr[mid]){
            return mid;
        }

        if(arr[mid]> target){
            return findTarget(arr, target, s, mid-1);
        }
        if(arr[mid]<target)
        return findTarget(arr, target, mid+1, e);

        return -1;
    }
}
