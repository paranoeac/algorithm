package programmers.level2;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class 문자열압축Test {

    @Test
    void solution() {
        문자열압축 sol = new 문자열압축();


        int result = sol.solution("ababcdcdababcdcd");
        assertEquals(9, result);

        int result1 = sol.solution("abcabcabcabcdededededede");
        assertEquals(14, result1);
    }
}