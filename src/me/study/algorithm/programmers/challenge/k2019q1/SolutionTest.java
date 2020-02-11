package me.study.algorithm.programmers.challenge.k2019q1;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class SolutionTest {

    Solution solution = new Solution();

    @Test
    @Parameters
    public void test(String[] record, String[] answer) {
        String[] result = this.solution.solution(record);

        assertEquals(Arrays.toString(answer), Arrays.toString(result));
    }

    private Object[] parametersForTest() {
        return new Object[] {
                new Object[] {
                        new String[] {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"},
                        new String[] {"Prodo님이 들어왔습니다.", "Ryan님이 들어왔습니다.", "Prodo님이 나갔습니다.", "Prodo님이 들어왔습니다."},
                }
        };
    }
}
