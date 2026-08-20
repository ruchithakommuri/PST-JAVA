public class Week5Task5 {

    static int myAtoi(String s) {
        s = s.trim();

        if (s.length() == 0) {
            return 0;
        }

        int sign = 1;
        int i = 0;

        if (s.charAt(0) == '-') {
            sign = -1;
            i++;
        } else if (s.charAt(0) == '+') {
            i++;
        }

        long result = 0;

        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            result = result * 10 + (s.charAt(i) - '0');

            if (result * sign > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }

            if (result * sign < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }

            i++;
        }

        return (int) (result * sign);
    }

    public static void main(String[] args) {
        String s = "42";

        System.out.println(myAtoi(s));
    }
}
