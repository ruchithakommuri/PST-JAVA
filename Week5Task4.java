public class Week5Task4 {

    static int maxSubarray(int[] nums) {
        int current = nums[0];
        int best = nums[0];

        for (int i = 1; i < nums.length; i++) {
            current = Math.max(nums[i], current + nums[i]);
            best = Math.max(best, current);
        }

        return best;
    }

    static int maxSubarrayCircular(int[] nums) {
        int normal = maxSubarray(nums);

        if (normal < 0) {
            return normal;
        }

        int total = 0;

        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
            nums[i] = -nums[i];
        }

        int circular = total + maxSubarray(nums);

        return Math.max(normal, circular);
    }

    public static void main(String[] args) {
        int[] nums = {5, -3, 5};

        System.out.println(maxSubarrayCircular(nums));
    }
}
