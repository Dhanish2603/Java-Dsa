package Practice.Recursion.Answers;

public class reverseString {
    class Solution {
        public void reverseString(char[] s) {
                char []p = new char[s.length];
                for(int i =0;i<s.length/2;i++){
                    char temp = s[i];
                    s[i] = s[s.length-i-1];
                    s[s.length-i-1] = temp;
                }
                 
        }
    }
}
