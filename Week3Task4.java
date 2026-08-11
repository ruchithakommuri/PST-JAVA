import java.time.*;
import java.util.*;

public class Week3Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();

        LocalDate date = LocalDate.of(year, month, day);

        System.out.println(date.getDayOfWeek());

        sc.close();
    }
}
