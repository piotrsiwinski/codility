package lesson.timecomplexity;

import java.util.Arrays;

public class TapeEquilibrium {
    public int solution(int[] A) {

        int oldDifference = Arrays.stream(A).sum();
        int difference = 0;
        int[] firstPart = {};
        int[] secondPart = {};

        for (int p = 1; p < A.length; p++) {
            firstPart = new int[p];
            for (int i = 0; i < p; i++) {
                firstPart[i] = A[i];
            }
            int j = 0;
            secondPart = new int[A.length - p];
            for (int i = p; i < A.length; i++) {
                secondPart[j++] = A[i];
            }
            difference = Math.abs(Arrays.stream(firstPart).sum() - Arrays.stream(secondPart).sum());
            System.out.println(String.format("Difference after iteration: %d", difference));
            if (oldDifference > difference) {
                oldDifference = difference;
            }
        }
        return oldDifference;
    }
}
