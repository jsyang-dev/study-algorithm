package me.study.algorithm.hackerrank.hashmaps.ransomnote;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class SolutionTest {

    Solution solution = new Solution();

    @Test
    @Parameters
    public void test(String[] magazine, String[] note, String answer) {
        String result = this.solution.solution(magazine, note);

        assertEquals(answer, result);
    }

    private Object[] parametersForTest() {
        return new Object[] {
                new Object[] {"give me one grand today night".split(" "), "give one grand today".split(" "), "Yes"},
                new Object[] {"two times three is not four".split(" "), "two times two is four".split(" "), "No"},
                new Object[] {"ive got a lovely bunch of coconuts".split(" "), "ive got some coconuts".split(" "), "No"}
        };
    }
}