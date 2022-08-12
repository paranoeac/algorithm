package programmers.level1;

public class 로또의최고순위와최저순위 {

    public int[] solution(int[] lottos, int[] win_nums) {

        int correctCnt = 0;
        int wildCardCnt = 0;
        int[] answer = new int[2];

        for (int i = 0; i < lottos.length; i++) {

            int lotto = lottos[i];
            if (lotto == 0) {
                wildCardCnt++;
                continue;
            }

            for (int j = 0; j < win_nums.length; j++) {
                int winNum = win_nums[j];
                if (lotto == winNum) {
                    correctCnt++;
                }
            }
        }

        answer[0] = (correctCnt + wildCardCnt) == 0 ? 6 : 6 - (correctCnt + wildCardCnt) + 1;
        answer[1] = correctCnt == 0 ? 6 : 6 - correctCnt + 1;

        return answer;
    }
}
