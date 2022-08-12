package leetcode.easy;

import leetcode.easy.TwoSum;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TwoSumTest {

    private TwoSum twoSum;

    @BeforeEach
    public void setUp() {
        this.twoSum = new TwoSum();
    }

    @Test
    public void solution() {
        int[] nums = {3, 3};
        int target = 6;

        int[] result = this.twoSum.solution(nums, target);

        int[] except = {0, 1};
        assertArrayEquals(except, result);
    }
}
