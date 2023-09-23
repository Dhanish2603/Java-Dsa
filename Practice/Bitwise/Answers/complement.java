package Practice.Bitwise.Answers;

public class complement {
    public static void main(String[] args) {
        // int num = 5;
    }
    public int findComplement(int num) {
        var nBits = (int) Math.floor((Math.log(num) / Math.log(2)) + 1);
        var mask = (1 << nBits) - 1;
        return ~num & mask;
    }
}
