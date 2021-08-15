public class StringToInteger {
    public static void main(String[] args) {

       /* Input: s = "4193 with words"
        Output: 4193
        Input: s = "   -42"
        Output: -42
        Input: s = "42"
        Output: 42*/
        String s =
                "9223372036854775808";
        System.out.println(myAtoi(s));
    }

    private static int myAtoi(String s) {

        if (s.length() == 0) {
            return 0;
        }
        s = s.trim();
        int sign = 1, startIndex = 0;
        double result = 0;
        boolean isNegative = false;
        //handle sign
        if (s.charAt(0) == '+') {
            startIndex++;
        }
        if (s.charAt(0) == '-') {
            startIndex++;
            sign = -1;
            isNegative = true;
        }
        for (int i = startIndex; i < s.length(); i++) {
            //exit loop if the character is not digit
            if (!Character.isDigit(s.charAt(i))) {
                break;
            }
            result = result * 10 + (s.charAt(i) - '0');
        }

        if (isNegative && result > Integer.MAX_VALUE) {
            return Integer.MIN_VALUE;
        }
        if (result > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        return (int) result * sign;
    }
}
