package lesson.iteration;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryGapTest {
    @Test
    public void solution() throws Exception {
        BinaryGap gap = new BinaryGap();
        System.out.println(gap.solution(529));
        System.out.println(gap.solution(1610612737));

        assertEquals(gap.solution(529), 4);
        assertEquals(gap.solution(1610612737), 28);
    }

}