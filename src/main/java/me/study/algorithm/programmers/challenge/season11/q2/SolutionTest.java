package me.study.algorithm.programmers.challenge.season11.q2;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/*
정수 n이 매개변수로 주어집니다.
다음 그림과 같이 밑변의 길이와 높이가 n인 삼각형에서 맨 위 꼭짓점부터 반시계 방향으로 달팽이 채우기를 진행한 후,
첫 행부터 마지막 행까지 모두 순서대로 합친 새로운 배열을 return 하도록 solution 함수를 완성해주세요.
 */
@RunWith(JUnitParamsRunner.class)
public class SolutionTest {

    Solution solution = new Solution();

    @Test
    @Parameters
    public void test(int n, int[] answer) {
        int[] result = this.solution.solution(n);

        assertEquals(Arrays.toString(answer), Arrays.toString(result));
    }

    private Object[] parametersForTest() {
        return new Object[]{
                new Object[]{1, new int[]{1}},
                new Object[]{2, new int[]{1, 2, 3}},
                new Object[]{4, new int[]{1, 2, 9, 3, 10, 8, 4, 5, 6, 7}},
                new Object[]{5, new int[]{1, 2, 12, 3, 13, 11, 4, 14, 15, 10, 5, 6, 7, 8, 9}},
                new Object[]{6, new int[]{1, 2, 15, 3, 16, 14, 4, 17, 21, 13, 5, 18, 19, 20, 12, 6, 7, 8, 9, 10, 11}},
        };
    }
}
