
import java.util.HashMap;


public class RomanToInteger {
    public static void main(String[] args) {
//        Input: s = "LVIII";
//        Output: 58
//        Explanation: L = 50, V= 5, III = 3.
        String s = "LVIII";
        System.out.println(romanToInt(s));
    }

    private static int romanToInt(String s) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        hashMap.put('I', 1);
        hashMap.put('V', 5);
        hashMap.put('X', 10);
        hashMap.put('L', 50);
        hashMap.put('C', 100);
        hashMap.put('D', 500);
        hashMap.put('M', 1000);

        Character last = s.charAt(s.length() - 1);
        int result = hashMap.get(last);
        for (int i = s.length() - 2; i >= 0; i--) {
            if (hashMap.get(s.charAt(i)) < hashMap.get(s.charAt(i + 1))) {
                result = result - hashMap.get(s.charAt(i));
            } else {
                result = result + hashMap.get(s.charAt(i));
            }
        }
        System.out.println(hashMap);
        return result;
    }
}
