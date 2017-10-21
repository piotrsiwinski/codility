package lesson.array;

public class CyclicRotation {

    private CyclicRotation() {
        throw new IllegalStateException("Static methods only in class");
    }

    public static int[] solution(int[] inputArray, int k) {
        if (inputArray.length == 0) {
            return inputArray;
        }
        //count real shift
        // if K = 15, length = 5, shift will be 0
        // k = 16, lenght = 5, shift will be 1
        int rotationNumber = k % inputArray.length;
        //dont have to rotate, return original array
        if (rotationNumber == 0) {
            return inputArray;
        }

        int[] result = new int[inputArray.length];
        //helper j to find new positions, when we reach end of shifted array
        int j = 0;
        for (int i = 0; i < inputArray.length; i++) {
            if (i + rotationNumber >= inputArray.length) {
                result[j++] = inputArray[i];
                continue;
            }
            result[i + rotationNumber] = inputArray[i];

        }
        return result;
    }
}
