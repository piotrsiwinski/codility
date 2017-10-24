package spoj.easy;

import java.util.Scanner;

public class Program {

    public static boolean isPrime(int number) {
        if (number == 1) {
            return false;
        }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        System.out.println(isPrime(i) ? "TAK" : "NIE");


    }
}
