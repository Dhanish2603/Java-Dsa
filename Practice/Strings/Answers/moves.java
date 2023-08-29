package Practice.Strings.Answers;

public class moves {
    public static void main(String[] args) {
        String str = "UD";
        judgeCircle(str);
        System.out.println(judgeCircle(str));
    }

    private static boolean judgeCircle(String str) {
        int u = 0;
        int d = 0;
        int l = 0;
        int r = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'U')
                u++;
            if (str.charAt(i) == 'L')
                l++;
            if (str.charAt(i) == 'D')
                d++;
            if (str.charAt(i) == 'R')
                r++;
        }

        if (u != d) {
            return false;
        }
        if (l != r) {
            return false;
        }
        return true;
    }
}
