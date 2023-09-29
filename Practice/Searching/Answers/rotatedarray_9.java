package Practice.Searching.Answers;

public class rotatedarray_9 {
    public static void main(String[] args) {
        // int[] arr = { 5,1,2,3,4};
        int []arr = {4,0,1,2,3}; 
        
        System.out.println(rotateArray(arr, 1));
    }

    private static int rotateArray(int[] arr, int target) {

        int index = startIndex(arr)+1 ;
        // System.out.println(index);

        return index;
    }

    

    private static int startIndex(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[start]) {
                return mid - 1;
            }

            if (arr[start] >= arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

}
