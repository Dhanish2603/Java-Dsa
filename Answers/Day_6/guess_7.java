package Day_6;

public class guess_7 {
    public static void main(String[] args) {
        
    }
    public int guess(int n){
        return 1;
    }
    public int guessNumber(int n) {
        int low =0;
        int high = n;
        while(low<=high){
        int mid = low + (high-low)/2;
            if(guess(mid)==0){
                return mid;
            }
            if(guess(mid)==1){
               low = mid+1; 
            }
            if(guess(mid) == -1){
                high = mid-1;
            }
        }
        return low;
    }
}
