package Practice.Strings.Answers;

public class reversewords {
    public static void main(String[] args) {
        String str = "Let's take LeetCode contest";
        
        System.out.println(reverseWords(str));
    }

    public static String reverseWords(String s) {
        String str[] = s.split(" ");
          s = "";
          for (int i = 0; i < str.length; i++) {
              StringBuilder sb = new StringBuilder(str[i]);
              // System.out.println(sb.reverse());
              str[i] = sb.reverse().toString();
              if(i!=0)
              s = s +" "+ str[i] ;
              else
              s = s + str[i] ;
  
          }
          return s;  
      }
}
