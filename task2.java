import java.util.*;
import java.util.stream.*;

public class task2 {

    static class Reading {
        String sensorId;
        int temperature;

        Reading(String sensorId, int temperature) {
            this.sensorId = sensorId;
            this.temperature = temperature;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Reading> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String id = sc.next();
            int temp = sc.nextInt();
            list.add(new Reading(id, temp));
        }

        Map<String, Double> result = list.stream()
                .filter(r -> r.temperature > 50)
                .collect(Collectors.groupingBy(
                        r -> r.sensorId,
                        Collectors.averagingInt(r -> r.temperature)
                ));

        result.entrySet().stream()
                .sorted((a, b) -> Double.compare(b.getValue(), a.getValue()))
                .forEach(x -> System.out.println(x.getKey() + " " + x.getValue()));

        sc.close();
    }
}