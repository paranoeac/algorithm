package programmers.level1;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class 로또의최고순위와최저순위Test {

    @Test
    void solution() {
        // given
        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums = {31, 10, 45, 1, 6, 19};
        int[] result = {3, 5};

        로또의최고순위와최저순위 sol = new 로또의최고순위와최저순위();
        int[] res = sol.solution(lottos, win_nums);

        assertArrayEquals(result, res);
    }

    @Test
    void solution1() {
        // given
        int[] lottos = {0, 0, 0, 0, 0, 0};
        int[] win_nums = {38, 19, 20, 40, 15, 25};
        int[] result = {1, 6};

        로또의최고순위와최저순위 sol = new 로또의최고순위와최저순위();
        int[] res = sol.solution(lottos, win_nums);

        assertArrayEquals(result, res);
    }

    @Test
    void solution2() {
        // given
        int[] lottos = {45, 4, 35, 20, 3, 9};
        int[] win_nums = {20, 9, 3, 45, 4, 35};
        int[] result = {1, 1};

        로또의최고순위와최저순위 sol = new 로또의최고순위와최저순위();
        int[] res = sol.solution(lottos, win_nums);

        assertArrayEquals(result, res);
    }

}