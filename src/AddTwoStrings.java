public class AddTwoStrings {
    public static void main(String[] args) {
/*        Input: num1 = "456", num2 = "77"
        Output: "533"*/
        String num1 = "1";
        String num2 = "9";
        System.out.println('3' - '1');// 51 - 49
        System.out.println(addStrings(num1, num2));
    }

    private static String addStrings(String num1, String num2) {
        String answer = "";
        int intNum1 = num1.length() - 1;
        int intNum2 = num2.length() - 1;
        int sum, carry = 0;
        while (intNum1 >= 0 && intNum2 >= 0) {
            int digit1 = num1.charAt(intNum1) - '0';
            int digit2 = num2.charAt(intNum2) - '0';
            sum = digit1 + digit2 + carry;
            carry = sum / 10;
            sum = sum % 10;
            // answer = answer + sum;
            answer = sum + answer;
            intNum1--;
            intNum2--;
        }

        while (intNum1 >= 0){
            int digit = num1.charAt(intNum1) - '0';
            sum = digit + carry;
            carry = sum / 10;
            sum = sum % 10;
            answer = sum + answer;
            intNum1--;
        }
        while (intNum2 >= 0){
            int digit = num2.charAt(intNum2) - '0';
            sum = digit + carry;
            carry = sum / 10;
            sum = sum % 10;
            answer = sum + answer;
            intNum2--;
        }
        if(carry == 1){
            answer = '1' + answer;
        }
        return answer;
    }
}
