package io.github.alphabet;

import org.junit.Assert;
import org.junit.Test;

public class AggregationAlphabetTest {

    /**
     * 测试字母表3个连续字母聚合
     */
    @Test
    public void testAggrAlphabet() {
        testAggrAlphabet("abcccbad","d");
    }

    /**
     * 测试字母表3个以上连续字母聚合
     */
    @Test
    public void testAggrAlphabet2() {
        testAggrAlphabet("abccccccccbaeeeeeeeed","dd");
    }

    private void testAggrAlphabet(String input,String expect) {
        AlphabetContext context = new AlphabetContext();
        context.setAlphabet(new AggregationAlphabet());
        System.out.printf("Input: %s\n", input);
        System.out.println("Output: ");
        String result = context.alphabetFormat(input);
        Assert.assertEquals(result, expect);
    }
}