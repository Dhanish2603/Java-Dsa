package Practice.Recursion.Answers;
public class power3 {
    class Solution {
        public boolean isPowerOfThree(int n) {                        
            return n <=0 ? false : n==1 || (n%3==0 && isPowerOfThree(n/3)) ? true : false;            
        }
    }   
}
