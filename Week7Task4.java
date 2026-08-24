import java.util.*;

public class Week7Task4 {

    static class BrowserHistory {
        ArrayList<String> history = new ArrayList<>();
        int current = 0;

        BrowserHistory(String homepage) {
            history.add(homepage);
        }

        void visit(String url) {
            current++;

            while (history.size() > current) {
                history.remove(history.size() - 1);
            }

            history.add(url);
        }

        String back(int steps) {
            current = Math.max(0, current - steps);
            return history.get(current);
        }

        String forward(int steps) {
            current = Math.min(history.size() - 1, current + steps);
            return history.get(current);
        }
    }

    public static void main(String[] args) {
        BrowserHistory browser =
            new BrowserHistory("google.com");

        browser.visit("youtube.com");
        browser.visit("leetcode.com");

        System.out.println(browser.back(1));
        System.out.println(browser.forward(1));
    }
}
