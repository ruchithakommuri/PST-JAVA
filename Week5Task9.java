import java.util.*;

public class Week5Task9 {

    public static void main(String[] args) {
        String[] words = {"mass", "as", "hero", "superhero"};

        ArrayList<String> result = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {

                if (i != j && words[j].contains(words[i])) {
                    result.add(words[i]);
                    break;
                }
            }
        }

        System.out.println(result);
    }
}
