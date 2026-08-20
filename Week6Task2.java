public class Week6Task2 {

    static boolean repeatedSubstringPattern(String s) {
        String temp = s + s;

        return temp.substring(1, temp.length() - 1).contains(s);
    }

    public static void main(String[] args) {
        String s = "abab";

        System.out.println(repeatedSubstringPattern(s));
    }
}
