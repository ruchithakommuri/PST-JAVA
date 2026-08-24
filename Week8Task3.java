public class Week8Task3 {

    static class Singleton {
        private static Singleton instance;
        String str;

        private Singleton() {
        }

        public static Singleton getSingleInstance() {
            if (instance == null) {
                instance = new Singleton();
            }

            return instance;
        }
    }

    public static void main(String[] args) {
        Singleton s1 = Singleton.getSingleInstance();
        Singleton s2 = Singleton.getSingleInstance();

        s1.str = "Hello Java";

        System.out.println(s1.str);
        System.out.println(s1 == s2);
    }
}
