package lesson.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class OddOccurencesInArrayTest {
    @Test
    public void solution() throws Exception {
        int[] testArr = {9, 3, 9, 3, 9, 7, 9};
        int[] arr = {};
        OddOccurencesInArray occurences = new OddOccurencesInArray();

        assertEquals(occurences.solution(testArr), 7);
    }

}