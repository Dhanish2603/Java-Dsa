package Practice.Strings.Answers;

public class splitpalin {
    public static void main(String[] args) {
        // String str1;
        // String str2;
        // System.out.println(checkPalindromeFormation("xbdef", "xecab"));
    }

    class Solution {
        public boolean checkPalindromeFormation(String a, String b) {
        
          return validate(a,b) || validate(b,a);
        }
        
        private boolean validate(String a, String b) {
            int l = 0, r = a.length()-1;
            while (l < r) {
                if (a.charAt(l) != b.charAt(r)) 
                    break; 
                l++;
                r--;
            }
            
            return  validate(a,l,r) || validate(b,l,r);
        }
        
        private boolean validate( String a, int l, int r )
        {
             while (l < r) {
                if (a.charAt(l) != a.charAt(r)) 
                    break; 
                l++;
                r--;
            }
        return l >=r;
        }
    }

    //my logic in progress

    // public static boolean checkPalindromeFormation(String a, String b) {

    // return convertedCheck("", a, "", b);
    // }

    // public static boolean convertedCheck(String a1, String a2, String b1, String
    // b2) {

    // StringBuilder sb1 = new StringBuilder(a1 + b2);
    // StringBuilder sb2 = new StringBuilder(b1 + a2);
    // sb1.reverse();
    // sb2.reverse();
    // if ((a1 + b2).equals(sb1.toString()) || (b1 + a2).equals(sb2.toString())) {
    // // System.out.println(sb1);
    // return true;

    // } else {
    // // System.out.println(a2+" "+b2);
    // char c1 = a2.charAt(0);
    // char c2 = b2.charAt(0);
    // // System.out.println(a1+" "+b1);
    // if(a2.isEmpty()){
    // return false;
    // }else{
    // return convertedCheck(a1 + c1, a2.substring(1), b1 + c2, b2.substring(1));

    // }

    // }

    // }

}
