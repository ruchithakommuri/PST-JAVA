import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String hashtag = sc.next();

            if (map.containsKey(hashtag)) {
                map.put(hashtag, map.get(hashtag) + 1);
            } else {
                map.put(hashtag, 1);
            }
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        sc.close();
    }
}
