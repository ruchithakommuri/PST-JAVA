import java.util.*;

public class Week3Task9 {
    public static void main(String[] args) {
        String[] names = {"Mary", "John", "Emma"};
        int[] heights = {180, 165, 170};

        Integer[] index = new Integer[names.length];

        for (int i = 0; i < names.length; i++) {
            index[i] = i;
        }

        Arrays.sort(index, (a, b) -> heights[b] - heights[a]);

        for (int i : index) {
            System.out.print(names[i] + " ");
        }
    }
}
