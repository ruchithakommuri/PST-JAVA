import java.util.*;

public class Week6Task3 {

    static boolean commonCharacter(String a, String b) {
        boolean[] present = new boolean[26];

        for (char c : a.toCharArray()) {
            present[c - 'a'] = true;
        }

        for (char c : b.toCharArray()) {
            if (present[c - 'a']) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            String a = sc.next();
            String b = sc.next();

            System.out.println(
                commonCharacter(a, b) ? "YES" : "NO"
            );
        }

        sc.close();
    }
}
