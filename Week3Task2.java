import java.time.*;
import java.util.*;

public class Week3Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String date1 = sc.nextLine();
        String date2 = sc.nextLine();

        LocalDate d1 = LocalDate.parse(date1);
        LocalDate d2 = LocalDate.parse(date2);

        int days = (int) Math.abs(d1.toEpochDay() - d2.toEpochDay());

        System.out.println(days);

        sc.close();
    }
}
