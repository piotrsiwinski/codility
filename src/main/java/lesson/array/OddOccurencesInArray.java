package lesson.array;

public class OddOccurencesInArray {


    public int solution(int[] A) {
        int count = 0;
        int currentNumber = 0;
        for (int i = 0; i < A.length; i++) {
            currentNumber = A[i];
            if(currentNumber == -1){
                continue;
            }
            for (int j = i; j < A.length; j++) {
                if (A[j] == currentNumber) {
                    count++;
                    A[j] = -1;
                }
            }
            if (count % 2 == 1) {
                return currentNumber;
            }
            count = 0;
        }
        return 0;
    }
}
