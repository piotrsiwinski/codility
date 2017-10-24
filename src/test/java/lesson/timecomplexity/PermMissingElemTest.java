package lesson.timecomplexity;

import org.junit.Test;

import static org.junit.Assert.*;

public class PermMissingElemTest {
    @Test
    public void solution() throws Exception {
        int[] arr = {2, 3, 1, 5};
        PermMissingElem elem = new PermMissingElem();
        assertEquals(elem.solution(arr), 4);
    }

}