import java.util.*;

public class Week5Task6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();

            int deletions = 0;

            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(i) == s.charAt(i - 1)) {
                    deletions++;
                }
            }

            System.out.println(deletions);
        }

        sc.close();
    }
}
