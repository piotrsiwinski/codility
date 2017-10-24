package lesson.array;

import org.junit.Test;

import java.util.Random;

public class RandomTest {
    @Test
    public void test() {
        Random rand = new Random();


        for(int i =0; i< 100; i++){
            int  n = rand.nextInt(10)+1;
            System.out.println(n);
        }
    }
}
