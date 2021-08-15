import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
//        Input: strs = ["flower","flow","flight"]
//        Output: "fl"
//
//        Input: strs = ["dog","racecar","car"]
//        Output: ""
//        Explanation: There is no common prefix among the input strings.
        String[] strs = new String[]{"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(strs));
    }

    private static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";
        String result = "";
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];

        for (int i = 0;i< first.length(); i++){
            if (first.charAt(i)== last.charAt(i)){
                result = result + first.charAt(i);
            }else {
                return result;
            }
        }
        return result;
    }
}
