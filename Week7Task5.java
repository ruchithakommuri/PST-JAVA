public class Week7Task5 {

    static class MyHashSet {
        boolean[] set = new boolean[1000001];

        void add(int key) {
            set[key] = true;
        }

        void remove(int key) {
            set[key] = false;
        }

        boolean contains(int key) {
            return set[key];
        }
    }

    public static void main(String[] args) {
        MyHashSet set = new MyHashSet();

        set.add(5);

        System.out.println(set.contains(5));

        set.remove(5);

        System.out.println(set.contains(5));
    }
}
