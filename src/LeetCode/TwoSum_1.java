package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum_1 {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> ts = new HashMap<>();
        int[] numbers = new int[2];

        for (int i = 0; i < nums.length; i++) {
            if (ts.containsKey(target - nums[i])) {
                numbers[1] = i;
                numbers[0] = ts.get(target - nums[i]);
                return numbers;
            }
            ts.put(nums[i], i);
        }
        return numbers;
    }
}
