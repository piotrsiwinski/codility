package lesson.array;

import lombok.val;
import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Test;

import static org.junit.Assert.*;

public class CyclicRotationTest {
    @Test
    public void solution() throws Exception {
        int[] givenArray = {3, 8, 9, 7, 6};
        int k = 3;

        int[] solution = CyclicRotation.solution(givenArray, k);
        int[] expectedResult = {9, 7, 6, 3, 8};
        for (int i = 0; i < solution.length; i++) {
            assertEquals(solution[i], expectedResult[i]);
        }
    }

}