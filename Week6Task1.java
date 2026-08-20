import java.util.*;

public class Week6Task1 {

    static int similarity(String s) {
        int n = s.length();
        int total = n;

        for (int i = 1; i < n; i++) {
            int j = 0;

            while (i + j < n && s.charAt(j) == s.charAt(i + j)) {
                j++;
            }

            total += j;
        }

        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();
            System.out.println(similarity(s));
        }

        sc.close();
    }
}
