import java.util.*;

public class Week3Task10 {
    public static void main(String[] args) {
        Integer[] numbers = {5, 2, 8, 1, 9, 3};

        Arrays.sort(numbers, new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                return b - a;
            }
        });

        for (int n : numbers) {
            System.out.print(n + " ");
        }
    }
}
