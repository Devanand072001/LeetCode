public class ReverseInteger {
    public static void main(String[] args) {
        int x = 123;
        System.out.println(reverse(x));
    }

    private static int reverse(int x) {
        int rev = 0, pop;
        while (x != 0) {
           // System.out.println("x: " + x);
            pop = x % 10;
          //  System.out.println("pop: " + pop);
            x = x / 10;
           // System.out.println("x: " + x);
            if(rev > Integer.MAX_VALUE/10 || rev == Integer.MAX_VALUE/10 && pop > 7){
                return 0;
            }
            if (rev < Integer.MIN_VALUE/10 ||  rev == Integer.MIN_VALUE/10 && pop < -8){
                return 0;
            }
            rev = (rev * 10) + pop;
           // System.out.println("rev: " + rev);
        }
        return rev;
    }
}
