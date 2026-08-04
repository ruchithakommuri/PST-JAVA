import java.util.*;

public class Main {

    public static int largestAltitude(int[] gain) {
        int altitude = 0;
        int maxAltitude = 0;

        for (int i = 0; i < gain.length; i++) {
            altitude += gain[i];
            if (altitude > maxAltitude) {
                maxAltitude = altitude;
            }
        }

        return maxAltitude;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] gain = new int[n];

        for (int i = 0; i < n; i++) {
            gain[i] = sc.nextInt();
        }

        System.out.println(largestAltitude(gain));
    }
}