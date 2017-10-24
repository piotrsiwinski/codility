package lesson.timecomplexity;

import lombok.val;
import org.junit.Test;

import static org.junit.Assert.*;

public class TapeEquilibriumTest {
    @Test
    public void solution() throws Exception {
        TapeEquilibrium tape = new TapeEquilibrium();
        int[] arr = {3, 1, 2, 4, 3};
        assertEquals(tape.solution(arr), 1);
    }

}