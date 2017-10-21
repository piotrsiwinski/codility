package lesson.array;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class OddOccurencesInArray {


    public int solution(int[] A) {
        Map<Integer, AtomicInteger> map = new HashMap<>();
        for (int a : A) {
            map.putIfAbsent(a, new AtomicInteger());
            map.get(a).incrementAndGet();
        }
        return map.entrySet()
                .stream()
                .filter(entry -> entry.getValue().intValue() % 2 == 1)
                .findFirst()
                .map(m -> m.getKey())
                .orElse(0);
    }
}
