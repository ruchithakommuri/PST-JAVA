import java.util.*;

public class Week8Task9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("Exception: / by zero");
        }

        sc.close();
    }
}
