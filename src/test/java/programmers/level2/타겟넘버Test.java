package programmers.level2;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class 타겟넘버Test {

    @Test
    void solution1() {
        타겟넘버 sol = new 타겟넘버();

        int result = sol.solution(new int[]{1, 1, 1, 1, 1}, 3);
        assertEquals(5, result);

    }

    @Test
    void solution2() {
        타겟넘버 sol = new 타겟넘버();

        int result1 = sol.solution(new int[]{4, 1, 2, 1}, 4);
        assertEquals(2, result1);
    }
}