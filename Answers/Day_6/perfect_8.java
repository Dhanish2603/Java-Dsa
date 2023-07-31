package Day_6;

public class perfect_8 {
    public static void main(String[] args) {
        
    }
    public boolean isPerfectSquare(int num) {
        long start = 1;
        long end = num;
            if(num ==1)
            return true;
        while(start<=end){
            long mid = start+(end-start)/2;
            if(num == mid*mid)
            {
                return true;
            }
           else if(num<mid*mid){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
            
        }
        return false;
    }
}
