import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Map<String, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String id = sc.next();
            int temperature = sc.nextInt();

            if (temperature > 50) {
                map.computeIfAbsent(id, k -> new ArrayList<>()).add(temperature);
            }
        }

        List<String> sensors = new ArrayList<>(map.keySet());

        sensors.sort((a, b) -> {
            double avgA = map.get(a).stream()
                    .mapToInt(Integer::intValue)
                    .average()
                    .orElse(0);

            double avgB = map.get(b).stream()
                    .mapToInt(Integer::intValue)
                    .average()
                    .orElse(0);

            return Double.compare(avgB, avgA);
        });

        for (String sensor : sensors) {
            double average = map.get(sensor).stream()
                    .mapToInt(Integer::intValue)
                    .average()
                    .orElse(0);

            System.out.println(sensor + " " + average);
        }

        sc.close();
    }
}
