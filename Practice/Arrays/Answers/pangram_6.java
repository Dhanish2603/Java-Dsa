import java.util.Arrays;

public class pangram_6 {
    public static void main(String[] args) {
        String str = "thequickbrownfoxjumpsoverthelazydog";

        System.out.println(check(str));
    }

    private static boolean check(String str) {
        char[]ch = str.toCharArray();
        Arrays.sort(ch);
        int count = 0;
        for(int i =0;i<ch.length;i++){
            if(ch[i] == (int)('a'+count)){
                count++;
            }
            
        }
        if(count == 26){
            return true;
        }
        return false;
    }
}
