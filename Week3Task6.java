import java.util.*;

public class Week3Task6 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        list.add(1, 15);
        list.remove(2);

        for (int value : list) {
            System.out.print(value + " ");
        }
    }
}
