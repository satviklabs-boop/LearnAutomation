import java.util.HashSet;

public class LongestSubstring {

    public static void main(String[] args) {

        String str = "abcabcbb";

        HashSet<Character> set = new HashSet<>();

        int left = 0;
        int maxLength = 0;
        String longest = "";

        for (int right = 0; right < str.length(); right++) {

            char ch = str.charAt(right);

            // If character already exists, remove from left
            while (set.contains(ch)) {
                set.remove(str.charAt(left));
                left++;
            }

            set.add(ch);

            // Check longest substring
            if (right - left + 1 > maxLength) {
                maxLength = right - left + 1;
                longest = str.substring(left, right + 1);
            }
        }

        System.out.println("Longest substring: " + longest);
        System.out.println("Length: " + maxLength);
    }
}