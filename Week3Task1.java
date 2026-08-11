import java.time.*;
import java.util.*;

public class Week3Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String date = sc.nextLine();
        LocalDate d = LocalDate.parse(date);

        System.out.println(d.getDayOfWeek());
        System.out.println(d.getDayOfMonth());
        System.out.println(d.getMonth());
        System.out.println(d.getYear());

        sc.close();
    }
}
