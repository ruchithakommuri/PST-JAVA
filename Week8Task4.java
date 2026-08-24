public class Week8Task4 {

    interface Visitor {
        void visit();
    }

    static class StudentVisitor implements Visitor {
        public void visit() {
            System.out.println("Visiting Student");
        }
    }

    static class TeacherVisitor implements Visitor {
        public void visit() {
            System.out.println("Visiting Teacher");
        }
    }

    public static void main(String[] args) {
        Visitor student = new StudentVisitor();
        Visitor teacher = new TeacherVisitor();

        student.visit();
        teacher.visit();
    }
}
