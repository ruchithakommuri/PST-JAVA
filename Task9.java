import java.util.Scanner;

class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException();
        }

        return a / b;
    }
}

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        String operator = sc.next();
        int b = sc.nextInt();

        Calculator calculator = new Calculator();

        try {
            if (operator.equals("+")) {
                int result = calculator.add(a, b);

                if (result == a + b) {
                    System.out.println("Test Passed");
                } else {
                    System.out.println("Test Failed");
                }
            } else if (operator.equals("/")) {
                int result = calculator.divide(a, b);

                if (result == a / b) {
                    System.out.println("Test Passed");
                } else {
                    System.out.println("Test Failed");
                }
            } else {
                System.out.println("Test Failed");
            }
        } catch (ArithmeticException e) {
            System.out.println("Test Failed");
        }

        sc.close();
    }
}
