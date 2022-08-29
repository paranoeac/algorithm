package programmers.level2;

import java.util.*;

public class 타겟넘버 {

    private int TARGET = 0;
    private int LAST_DEPTH = 0;
    private int ANSWER = 0;

    public int solution(int[] numbers, int target) {
        this.TARGET = target;
        this.LAST_DEPTH = numbers.length;

        this.dfs(numbers, 0);

        return ANSWER;
    }

    public void dfs(int[] numbers, int currentDepth) {
        if (currentDepth == this.LAST_DEPTH) {
            if (this.getSum(numbers) == this.TARGET) {
                this.ANSWER++;
            }
            return;
        }

        this.dfs(numbers, currentDepth + 1);

        numbers[currentDepth] = numbers[currentDepth] * -1;
        this.dfs(numbers, currentDepth + 1);
    }

    public int getSum(int[] numbers) {
        int result = 0;
        for (int i : numbers) {
            result += i;
        }
        return result;
    }
}
