package Day_10;

public class ShuffleString_7 {
 public static void main(String[] args) {
    
 }
    public static String restoreString(String s, int[] indices) {
        char []arr = new char[s.length()];
        // int i =0;
            for(int i=0;i<indices.length;i++){
                arr[indices[i]]=s.charAt(i);
            }
        return String.valueOf(arr);

    }
}
