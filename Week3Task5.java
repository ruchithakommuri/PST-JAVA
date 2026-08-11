import java.util.*;

public class Week3Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            pq.add(sc.nextInt());
        }

        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " ");
        }

        sc.close();
    }
}