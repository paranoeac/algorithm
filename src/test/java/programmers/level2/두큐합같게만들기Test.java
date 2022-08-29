package programmers.level2;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class 두큐합같게만들기Test {

    @Test
    void solution() {
        두큐합같게만들기 sol = new 두큐합같게만들기();
        int result1 = sol.solution(new int[]{3, 2, 7, 2}, new int[]{4, 6, 5, 1});
        assertEquals(2, result1);

        int result2 = sol.solution(new int[]{1, 2, 1, 2}, new int[]{1, 10, 1, 2});
        assertEquals(7, result2);

        int result3 = sol.solution(new int[]{1, 1}, new int[]{1, 5});
        assertEquals(-1, result3);
    }
}