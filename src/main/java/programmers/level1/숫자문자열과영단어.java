package programmers.level1;

public class 숫자문자열과영단어 {

    public int solution(String s) {

        String answerStr = s;

        for (EnglishWordsOfNumber englishWordsOfNumber : EnglishWordsOfNumber.values()) {
            String enumName = englishWordsOfNumber.name();
            String value = String.valueOf(englishWordsOfNumber.value);
            answerStr = answerStr.replaceAll(enumName, value);
        }

        return Integer.parseInt(answerStr);
    }
}

enum EnglishWordsOfNumber {
    zero(0),
    one(1),
    two(2),
    three(3),
    four(4),
    five(5),
    six(6),
    seven(7),
    eight(8),
    nine(9);

    public final int value;

    EnglishWordsOfNumber(int i) {
        this.value = i;
    }
}
