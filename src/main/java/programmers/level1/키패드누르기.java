package programmers.level1;

import java.util.*;

public class 키패드누르기 {

    private final String L_CODE = "L";
    private final String R_CODE = "R";

    private final String[][] KEY_PAD = {
            {"1", "2", "3"},
            {"4", "5", "6"},
            {"7", "8", "9"},
            {"*", "0", "#"}
    };

    private int[] atLeft = {3, 0}; // 왼손좌표
    private int[] atRight = {3, 2}; // 오른손좌표
    private int[] atNumber = {0, 0}; // 숫자좌표

    public String solution(int[] numbers, String hand) {
        String answer = "";

        for (int i = 0; i < numbers.length; i++) {
            String number = String.valueOf(numbers[i]);
            String handCode = this.getHands(number);

            if (handCode != null) {
                answer += handCode;
            } else {
                answer += this.getHandsByDistance(hand);
            }
        }

        return answer;
    }

    public String getHandsByDistance(String mainHand) {
        int distanceCostL = Math.abs((atLeft[0] - atNumber[0])) + Math.abs((atLeft[1] - atNumber[1]));
        int distanceCostR = Math.abs((atRight[0] - atNumber[0])) + Math.abs((atRight[1] - atNumber[1]));

        if ((distanceCostR == distanceCostL && "right".equals(mainHand)) || distanceCostR < distanceCostL) {
            atRight = atNumber.clone();
            return R_CODE;
        } else {
            atLeft = atNumber.clone();
            return L_CODE;
        }
    }

    public String getHands(String s) {
        for (int i = 0; i < KEY_PAD.length; i++) {
            for (int j = 0; j < KEY_PAD[i].length; j++) {
                if (KEY_PAD[i][j].equals(s)) {
                    atNumber[0] = i;
                    atNumber[1] = j;

                    if (j == 0) {
                        atLeft = atNumber.clone();
                        return L_CODE;
                    }

                    if (j == 2) {
                        atRight = atNumber.clone();
                        return R_CODE;
                    }

                    break;
                }
            }
        }

        return null;
    }
}

