package me.study.algorithm.codility2.stacks_and_queues.brackets;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(JUnitParamsRunner.class)
public class SolutionTest {

    Solution solution = new Solution();

    @Test
    @Parameters
    public void test(String S, int answer) {
        int result = this.solution.solution(S);

        assertEquals(answer, result);
    }

    private Object[] parametersForTest() {
        return new Object[]{
                new Object[]{"{[()()]}", 1},
                new Object[]{"([)()]", 0},
                new Object[]{")(", 0},
                new Object[]{"{{{{", 0},
        };
    }
}
