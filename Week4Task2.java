import java.util.*;

public class Week4Task2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();
            int n = s.length();

            int[] count = new int[26];

            for (int i = 0; i < n / 2; i++) {
                count[s.charAt(i) - 'a']++;
            }

            for (int i = (n + 1) / 2; i < n; i++) {
                count[s.charAt(i) - 'a']--;
            }

            boolean answer = true;

            for (int i = 0; i < 26; i++) {
                if (count[i] != 0) {
                    answer = false;
                    break;
                }
            }

            System.out.println(answer ? "YES" : "NO");
        }

        sc.close();
    }
}
