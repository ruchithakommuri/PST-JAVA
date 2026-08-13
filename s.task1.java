import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int salary = sc.nextInt();
            System.out.print((salary * 110 / 100) + " ");
        }

        sc.close();
    }
}
