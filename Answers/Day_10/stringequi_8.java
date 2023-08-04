package Day_10;

public class stringequi_8 {
    public static void main(String[] args) {
        
    }
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuffer s1 = new StringBuffer();
        StringBuffer s2 = new StringBuffer();
        for(String s:word1){
            s1.append(s);
        }
        for(String s:word2){
            s2.append(s);
        }
        return s1.compareTo(s2)==0;
        
    }
}
