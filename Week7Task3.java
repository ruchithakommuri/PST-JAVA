import java.util.*;

public class Week7Task3 {

    static class CheckIn {
        String station;
        int time;

        CheckIn(String station, int time) {
            this.station = station;
            this.time = time;
        }
    }

    static class UndergroundSystem {
        HashMap<Integer, CheckIn> checkIns = new HashMap<>();
        HashMap<String, int[]> trips = new HashMap<>();

        void checkIn(int id, String stationName, int t) {
            checkIns.put(id, new CheckIn(stationName, t));
        }

        void checkOut(int id, String stationName, int t) {
            CheckIn in = checkIns.remove(id);

            String key = in.station + "-" + stationName;

            if (!trips.containsKey(key)) {
                trips.put(key, new int[2]);
            }

            trips.get(key)[0] += t - in.time;
            trips.get(key)[1]++;
        }

        double getAverageTime(String startStation, String endStation) {
            int[] data = trips.get(startStation + "-" + endStation);
            return (double) data[0] / data[1];
        }
    }

    public static void main(String[] args) {
        UndergroundSystem system = new UndergroundSystem();

        system.checkIn(1, "A", 3);
        system.checkOut(1, "B", 8);

        System.out.println(system.getAverageTime("A", "B"));
    }
}
