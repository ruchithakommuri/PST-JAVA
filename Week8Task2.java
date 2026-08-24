public class Week8Task2 {

    static class Bicycle {
        String define_me() {
            return "a vehicle with pedals.";
        }
    }

    static class Human extends Bicycle {
        String define_me() {
            return "a cycle with two wheels.";
        }

        Human() {
            System.out.println("Hello I am a bicycle with a latest technology.");
            System.out.println("My ancestor is a bicycle which is " + super.define_me());
            System.out.println("Hello I am a motorcycle, I am " + define_me());
        }
    }

    public static void main(String[] args) {
        new Human();
    }
}
