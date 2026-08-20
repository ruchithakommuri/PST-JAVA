import java.util.*;

public class Week6Task10 {

    static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int n = s.length();

        for (int start = 0; start < n; start++) {
            String rotated = s.substring(start) + s.substring(0, start);

            int longest = 1;

            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j <= n; j++) {

                    String sub = rotated.substring(i, j);

                    if (sub.length() > longest &&
                        isPalindrome(sub)) {
                        longest = sub.length();
                    }
                }
            }

            System.out.println(longest);
        }

        sc.close();
    }
}
