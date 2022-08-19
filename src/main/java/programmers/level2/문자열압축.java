package programmers.level2;

import java.util.*;

public class 문자열압축 {

    public int solution(String s) {

        int answer = s.length();

        for (int i = 1; i <= s.length() / 2; i++) {
            int length = this.calc(getList(s, i));

            if (answer > length) {
                answer = length;
            }
        }

        return answer;
    }

    public int calc(List<String> sList) {

        String rst = "";
        int matchCnt = 1;

        for (int i = 0; i < sList.size(); i++) {
            String first = sList.get(i);
            String second = "";

            if (i + 1 < sList.size()) {
                second = sList.get(i + 1);
            }

            if (first.equals(second)) {
                matchCnt++;
            } else {
                if (matchCnt > 1) {
                    rst += String.valueOf(matchCnt);
                    matchCnt = 1;
                }
                rst += first;
            }
        }

        return rst.length();
    }

    public List<String> getList(String s, int wordCnt) {
        List<String> result = new ArrayList<>();
        String temp = "";
        for (int i = 0; i < s.length(); i++) {
            temp += s.charAt(i);

            if (temp.length() == wordCnt) {
                result.add(temp);
                temp = "";
            }
        }

        if (!"".equals(temp)) {
            result.add(temp);
        }



        return result;
    }
}
