package programmers.level1;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class 키패드누르기Test {

    @Test
    void solution() {
        키패드누르기 sol = new 키패드누르기();
        String result = sol.solution(new int[]{1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5}, "right");
        assertEquals("LRLLLRLLRRL", result);
    }
}