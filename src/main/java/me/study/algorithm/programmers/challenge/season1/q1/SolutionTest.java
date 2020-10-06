package me.study.algorithm.programmers.challenge.season1.q1;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/*
정수 배열 numbers가 주어집니다.
numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는 모든 수를
배열에 오름차순으로 담아 return 하도록 solution 함수를 완성해주세요.
 */
@RunWith(JUnitParamsRunner.class)
public class SolutionTest {

    Solution solution = new Solution();

    @Test
    @Parameters
    public void test(int[] numbers, int[] answer) {
        int[] result = this.solution.solution(numbers);

        assertEquals(Arrays.toString(answer), Arrays.toString(result));
    }

    private Object[] parametersForTest() {
        return new Object[]{
                new Object[]{new int[]{2, 1, 3, 4, 1}, new int[]{2, 3, 4, 5, 6, 7}},
                new Object[]{new int[]{5, 0, 2, 7}, new int[]{2, 5, 7, 9, 12}}
        };
    }
}
