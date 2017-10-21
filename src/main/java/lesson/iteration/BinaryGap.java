package lesson.iteration;

import java.util.ArrayList;
import java.util.List;

public class BinaryGap {
    public int solution(int n) {
        String binaryString = Integer.toBinaryString(n);

        List<Integer> results = new ArrayList<>();
        int counter = 0;
        for (int i = 0; i < binaryString.length(); i++) {
            if (binaryString.charAt(i) == '1') {
                if (counter > 0) {
                    results.add(counter);
                    counter = 0;
                }
                continue;
            }
            counter++;
        }

        return results.stream().max(Integer::compareTo).orElse(0);
    }
}
