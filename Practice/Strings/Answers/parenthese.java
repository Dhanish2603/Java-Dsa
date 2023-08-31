package Practice.Strings.Answers;

public class parenthese {
    public boolean isValid(String s) {
        int length;
    
        do {
            length = s.length();
            s = s.replace("()", "").replace("{}", "").replace("[]", "");
        } while (length != s.length()); 
    
        return s.length() == 0; 
    }   
}
