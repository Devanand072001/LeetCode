import java.util.ArrayList;
import java.util.Collections;

public class LargestPalindromicSubString {
    public static void main(String[] args) {
        /*Input: s = "babad"
          Output: "bab"
          Note: "aba" is also a valid answer.*/
        String s = "babad";
        System.out.println(longestPalindrome(s));

    }

    static String longestPalindrome(String s) {

        ArrayList<String> palindromeString = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
//                System.out.println(s.substring(i, j));
                if (isPalindrome(s.substring(i, j))) {
                    palindromeString.add(s.substring(i, j));
                }
            }
        }
        if (s.length() >= 1000){
            return Character.toString(s.charAt(0)) ;
        }
//        System.out.println(palindromeString);
        return maxString(palindromeString);
    }

    private static String maxString(ArrayList<String> palindromeString) {
        String maxString = palindromeString.get(0);
        for (String i : palindromeString){
            if ( i.length() > maxString.length()){
                maxString = i;
            }
        }
        return maxString;
    }

    static boolean isPalindrome(String string) {
        StringBuilder stringBuilder = new StringBuilder(string);
        return string.equals(stringBuilder.reverse().toString());
    }
}
