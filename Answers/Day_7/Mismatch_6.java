package Day_7;

public class Mismatch_6 {
    public static void main(String[] args) {
        
    }
    public int[] findErrorNums(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i]-1;
            if ( arr[i] != arr[correct]) {
                swap(arr, i , correct);
            } else {
                i++;
            }

        }
        int[]ans = new int[2];
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index+1) {
                // return arr[index];
                ans[0]=arr[index];
                ans[1] = index+ 1;
            }
        }
        return ans;
    }
    public void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
