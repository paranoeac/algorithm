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

//    private int getLengthCompressedNumber(String s, int wordCnt) {
//
//        int matchCnt = 0;
//        String std = "";
//        String nxt = "";
//        String rst = "";
//
//        for (int i = 0; i < s.length(); i = i + wordCnt) {
//            if (std.equals("")) {
//                std = s.substring(i, i + wordCnt);
//            }
//
//            if (i + wordCnt + wordCnt > s.length()) {
//                nxt = s.substring(i);
//            } else {
//                nxt = s.substring(i + wordCnt, i + wordCnt + wordCnt);
//            }
//
//            if (std.equals(nxt)) {
//                matchCnt++;
//            } else {
//                if (matchCnt > 1) {
//                    rst += String.valueOf(matchCnt);
//                } else {
//                    rst += std;
//                    matchCnt = 0;
//                }
//            }
//
//            std = nxt;
//        }
//
//        System.out.println(rst);
//
//        return rst.length();
//    }
}
