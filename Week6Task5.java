import java.util.*;

public class Week6Task5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        String expected = "SOS";
        int changes = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != expected.charAt(i % 3)) {
                changes++;
            }
        }

        System.out.println(changes);

        sc.close();
    }
}
