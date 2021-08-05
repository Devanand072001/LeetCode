import java.util.HashSet;

public class LengthOfLongestSubstring {
    public static void main(String[] args) {
        String s = "abcabcbb";
        int length = lengthOfLongestSubstring(s);
        System.out.println(length);
    }

    private static int lengthOfLongestSubstring(String s) {
        int i = 0, j = 0, max = 0;
        HashSet<Character> hashSet = new HashSet<>();
        while (j < s.length()) {
            // add the character if not in hash set.
            if (!hashSet.contains(s.charAt(j))) {
                hashSet.add(s.charAt(j));
                j++;
                // update the max length
                max = Math.max(hashSet.size(), max);
            } else {
                // remove the previous character added, if the character is in hash set.
                hashSet.remove(s.charAt(i));
                i++;
            }
        }
        System.out.println(hashSet);
        return max;
    }
}
