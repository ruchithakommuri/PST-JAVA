import java.util.*;

public class Week7Task9 {

    static class Printer {
        <T> void printArray(T[] array) {
            for (T item : array) {
                System.out.println(item);
            }
        }
    }

    public static void main(String[] args) {
        Printer printer = new Printer();

        Integer[] numbers = {1, 2, 3};
        String[] words = {"Hello", "Java"};

        printer.printArray(numbers);
        printer.printArray(words);
    }
}
