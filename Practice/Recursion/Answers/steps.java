public class steps {
    class Solution {
        public int numberOfSteps(int num) {
            if(num == 0) return 0;
            int count = 1;
            while(num>1) {
                if(num%2 == 1) count++;
                num /=2;
                count++;
            }
            return count;
        }
    }
}
