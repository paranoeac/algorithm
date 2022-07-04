package easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanToIntegerTest {

    private RomanToInteger romanToInteger;

    @BeforeEach
    void setUp() {
        romanToInteger = new RomanToInteger();
    }

    @Test
    void solution() {
        String s1 = "III";
        assertEquals(3, romanToInteger.solution(s1));

        String s2 = "LVIII";
        assertEquals(58, romanToInteger.solution(s2));

        String s3 = "MCMXCIV";
        assertEquals(1994, romanToInteger.solution(s3));
    }

}