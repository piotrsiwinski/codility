package spoj.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class PrimeTTest {
    @Test
    public void isPrime() throws Exception {
        PrimeT t = new PrimeT();
        for (int i = 1; i < 10000; i++) {
            System.out.println(String.format("Liczba: %d czy pierwsza: %s", i, t.isPrime(i) ? "TAK" : "NIE"));
        }
    }

}