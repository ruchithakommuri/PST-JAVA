public class Week7Task8 {

    static class Arithmetic {
        int add(int a, int b) {
            return a + b;
        }
    }

    static class Adder extends Arithmetic {
    }

    public static void main(String[] args) {
        Adder adder = new Adder();

        System.out.println(adder.add(10, 20));
    }
}
