package lesson.timecomplexity;

public class PermMissingElem {
    //sum of arithmetic progression
    public int solution(int[] A) {
        long size = A.length + 1;
        long sum = (size * (size + 1)) / 2;
        for (int a : A) {
            sum -= a;
        }

        return (int) sum;
    }
}
