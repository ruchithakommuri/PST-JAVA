import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int option = sc.nextInt();

        int sum = 0;

        while (n > 0) {
            int digit = n % 10;

            if (option == 1 && digit % 2 == 0) {
                sum += digit;
            }

            if (option == 2 && digit % 2 != 0) {
                sum += digit;
            }

            n = n / 10;
        }

        System.out.println(sum);
    }
}
