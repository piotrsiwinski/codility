package lesson.timecomplexity;

public class BetterTapeEquilibrium {

    public int solution(int[] A) {
        int leftSum = A[0];
        int rightSum = 0;
        for (int i = 1; i < A.length; i++) {
            rightSum += A[i];
        }
        int difference = Math.abs(leftSum - rightSum);

        for (int i = 1; i < A.length; i++) {
            int nextVal = A[i];
            leftSum += nextVal;
            rightSum -= nextVal;
            int newDifference = Math.abs(leftSum - rightSum);
            if (newDifference < difference) {
                difference = newDifference;
            }
        }
        return difference;
    }
}
