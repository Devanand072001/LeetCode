import java.util.HashMap;

public class ZigZagConversion {
    public static void main(String[] args) {
        /*
         * P   A   H   N
         * A P L S I I G
         * Y   I   R
         */
//        Input: s = "PAYPALISHIRING", numRows = 3
//        Output: "PAHNAPLSIIGYIR"
        String s = "PAYPALISHIRING";
        int numRows = 3;
        System.out.println(convert(s, numRows));
    }

    private static String convert(String s, int numRows) {
        HashMap<Integer, StringBuilder> hashMap = new HashMap<>();
        int row = 0;
        boolean increment = true;
        for (char c : s.toCharArray()) {
            if (row == numRows) {
                increment = false;
            }
            if (row == 1) {
                increment = true;
            }
            if (increment) {
                row++;
            } else {
                row--;
            }
            if (!hashMap.containsKey(row)) {
                hashMap.put(row, new StringBuilder());
            }
            hashMap.get(row).append(c);
        }
        StringBuilder result = new StringBuilder();
        for (int i : hashMap.keySet()) {
            result.append(hashMap.get(i));
        }
        return result.toString();
    }
}
