package programmers.level1;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class 신규아이디추천Test {

    @Test
    void solution() {

        // given
        String new_id = "...!@BaT#*..y.abcdefghijklm";

        // when
        신규아이디추천 sol = new 신규아이디추천();

        String solutionResult = sol.solution(new_id);

        // then
        assertEquals("bat.y.abcdefghi", solutionResult);
    }

    @Test
    void solution1() {

        // given
        String new_id = "z-+.^.";

        // when
        신규아이디추천 sol = new 신규아이디추천();

        String solutionResult = sol.solution(new_id);

        // then
        assertEquals("z--", solutionResult);
    }

    @Test
    void solution2() {

        // given
        String new_id = "=.=";

        // when
        신규아이디추천 sol = new 신규아이디추천();

        String solutionResult = sol.solution(new_id);

        // then
        assertEquals("aaa", solutionResult);
    }

    @Test
    void solution3() {

        // given
        String new_id = "123_.def";

        // when
        신규아이디추천 sol = new 신규아이디추천();

        String solutionResult = sol.solution(new_id);

        // then
        assertEquals("123_.def", solutionResult);
    }

    @Test
    void solution4() {

        // given
        String new_id = "abcdefghijklmn.p";

        // when
        신규아이디추천 sol = new 신규아이디추천();

        String solutionResult = sol.solution(new_id);

        // then
        assertEquals("abcdefghijklmn", solutionResult);
    }

}