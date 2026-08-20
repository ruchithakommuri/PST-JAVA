import java.util.*;

public class Week5Task3 {

    static int maxSum(int[] arr) {
        int current = arr[0];
        int best = arr[0];

        for (int i = 1; i < arr.length; i++) {
            current = Math.max(arr[i], current + arr[i]);
            best = Math.max(best, current);
        }

        return best;
    }

    static int maxNonContiguous(int[] arr) {
        int sum = 0;
        int maximum = arr[0];

        for (int x : arr) {
            maximum = Math.max(maximum, x);

            if (x > 0) {
                sum += x;
            }
        }

        return sum > 0 ? sum : maximum;
    }

    public static void main(String[] args) {
        int[] arr = {2, -1, 2, 3, 4, -5};

        System.out.println(maxSum(arr));
        System.out.println(maxNonContiguous(arr));
    }
}


