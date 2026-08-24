import java.util.*;

public class Week7Task2 {

    static class Student {
    }

    static class Rockstar {
    }

    static class Hacker {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int student = 0;
        int rockstar = 0;
        int hacker = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();

            if (type.equals("Student")) {
                student++;
            } else if (type.equals("Rockstar")) {
                rockstar++;
            } else if (type.equals("Hacker")) {
                hacker++;
            }
        }

        System.out.println(student + " " + rockstar + " " + hacker);

        sc.close();
    }
}
