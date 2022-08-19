package programmers.level1;

import org.junit.jupiter.api.*;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class 숫자문자열과영단어Test {

    @Test
    void solution() {

        // given
        String[] given = {"one4seveneight", "23four5six7", "2three45sixseven", "123"};
        int[] result = {1478, 234567, 234567, 123};

        // when
        숫자문자열과영단어 sol = new 숫자문자열과영단어();

        int[] solutionResult = new int[4];
        for (int i = 0; i < given.length; i++) {
            solutionResult[i] = sol.solution(given[i]);
        }

        System.out.println(Arrays.toString(solutionResult));
        // then
        assertArrayEquals(result, solutionResult);
    }
}