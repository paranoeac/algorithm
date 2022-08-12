package programmers.level1;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class 신고결과받기Test {

    @Test
    void solution() {

        // given
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
        int[] result = {2, 1, 1, 0};

        // when
        신고결과받기 sol = new 신고결과받기();

        int[] solutionResult = sol.solution(id_list, report, 2);

        // then
        assertArrayEquals(result, solutionResult);
    }

    @Test
    void solution1() {
        // given
        String[] id_list = {"con", "ryan"};
        String[] report = {"ryan con", "ryan con", "ryan con", "ryan con"};
        int[] result = {0,0};

        // when
        신고결과받기 sol = new 신고결과받기();

        int[] solutionResult = sol.solution(id_list, report, 2);

        // then
        assertArrayEquals(result, solutionResult);
    }
}