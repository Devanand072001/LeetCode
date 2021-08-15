import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class IntegerToRoman {
    public static void main(String[] args) {
        /*
        Input: num = 9
        Output: "IX"
        Input: num = 58
        Output: "LVIII"
        Explanation: L = 50, V = 5, III = 3.
        Input: num = 1994
        Output: "MCMXCIV"
        Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
         */
        int input = 58;
        System.out.println(intToRoman(input));
    }

    private static String intToRoman(int input) {
        StringBuilder stringBuilder = new StringBuilder();
        int[] numerals = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1,};
        String[] romans = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        for (int i = 0; i< numerals.length;i++){
            while( input >= numerals[i]){
                //System.out.println("numerals: "+numerals[i]+" romans: "+romans[i]);
                stringBuilder.append(romans[i]);
                //System.out.println("input: "+input+" - numerals: "+numerals[i]);
                input = input - numerals[i];
                //System.out.println("input: "+input);
                //System.out.println();
            }
        }
        return stringBuilder.toString();
    }
}
