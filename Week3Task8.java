import java.util.*;

class Student {
    String name;
    int score;

    Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

public class Week3Task8 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Ravi", 85));
        students.add(new Student("Anu", 95));
        students.add(new Student("Kiran", 75));

        students.sort((a, b) -> b.score - a.score);

        for (Student s : students) {
            System.out.println(s.name + " " + s.score);
        }
    }
}
