package Practice.Strings.Answers;
public class goal{
    public static void main(String[] args) {
        String str = "G()()(al)";
             str = str.replace("()", "o");
             str = str.replace("(al)", "al");
            System.out.println(str);
    }
}