package me.study.algorithm.programmers.challenge.weekly.week6;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertArrayEquals;

/**
 * 복서 정렬하기 (https://programmers.co.kr/learn/challenges)
 */
@RunWith(JUnitParamsRunner.class)
public class SolutionTest {

    Solution solution = new Solution();

    @Test
    @Parameters
    public void test(int[] weights, String[] head2head, int[] answer) {
        int[] result = this.solution.solution(weights, head2head);
        assertArrayEquals(answer, result);
    }

    private Object[] parametersForTest() {
        return new Object[]{
                new Object[]{new int[]{50, 82, 75, 120}, new String[]{"NLWL", "WNLL", "LWNW", "WWLN"}, new int[]{3, 4, 1, 2}},
                new Object[]{new int[]{145, 92, 86}, new String[]{"NLW", "WNL", "LWN"}, new int[]{2, 3, 1}},
                new Object[]{new int[]{60, 70, 60}, new String[]{"NNN", "NNN", "NNN"}, new int[]{2, 1, 3}},
                new Object[]{new int[]{60, 60, 60}, new String[]{"NNN", "NNN", "NNN"}, new int[]{1, 2, 3}},
        };
    }
}
