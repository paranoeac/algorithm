package leetcode.easy;

public class TwoSum {

    public int[] solution(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (target - nums[i] == nums[j]) {
                    return new int[]{nums[i], nums[j]};
                }
            }
        }

        return null;
    }
}
