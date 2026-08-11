import java.util.*;

public class Week3Task7 {
    public static void main(String[] args) {
        String[] nums = {"10", "2"};

        Arrays.sort(nums, (a, b) -> (b + a).compareTo(a + b));

        for (String num : nums) {
            System.out.print(num);
        }
    }
}
