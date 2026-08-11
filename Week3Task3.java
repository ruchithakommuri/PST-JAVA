import java.time.*;
import java.util.*;

public class Week3Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String date = sc.nextLine();

        LocalDate d = LocalDate.parse(date);

        System.out.println(d.getDayOfYear());

        sc.close();
    }
}
