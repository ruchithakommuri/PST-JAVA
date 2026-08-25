public class Week8Task6 {

    interface AdvancedArithmetic {
        int divisorSum(int n);
    }

    static class MyCalculator implements AdvancedArithmetic {

        public int divisorSum(int n) {
            int sum = 0;

            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    sum += i;
                }
            }

            return sum;
        }
    }

    public static void main(String[] args) {
        MyCalculator calculator = new MyCalculator();

        System.out.println(calculator.divisorSum(6));
    }
}
