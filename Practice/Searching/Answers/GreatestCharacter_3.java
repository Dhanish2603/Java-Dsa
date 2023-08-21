public class GreatestCharacter_3 {
    public static void main(String[] args) {
        char ch[] = { 'c', 'f', 'j' };
        GreatestCharacter_3 obj = new GreatestCharacter_3();
        System.out.println(obj.nextGreatestLetter(ch, 'z'));
    }

    public char nextGreatestLetter(char[] letters, char target) {
        int end = letters.length - 1;
        int start = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
}
