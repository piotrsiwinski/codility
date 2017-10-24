package lesson.timecomplexity;

import org.junit.Test;

import static org.junit.Assert.*;

public class BetterTapeEquilibriumTest {
    @Test
    public void solution() throws Exception {
        BetterTapeEquilibrium equilibrium = new BetterTapeEquilibrium();
        int[] arr = {3, 1, 2, 4, 3};
        assertEquals(equilibrium.solution(arr), 1);
    }

}