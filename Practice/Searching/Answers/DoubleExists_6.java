package Practice.Searching.Answers;

public class DoubleExists_6 {
    public boolean checkIfExist(int[] arr) {
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j =0;j<n;j++){
                if(arr[j]*2 == arr[i] && j!=i)
                return true;
            }
        }
        return false;
    }
}
