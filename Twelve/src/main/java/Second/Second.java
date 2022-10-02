package Second;

import java.util.Arrays;

public class Second {
    private static final int NUMBER_COUNT = 31;
    private static final String[] numbers = new String[NUMBER_COUNT];


    public static void main(String[] args) {
        int i = 1;
        while (i <= NUMBER_COUNT) {
            numbers[i - 1] = "" + i;
            i++;
        }
        System.out.println("Початковий рядок: " + Arrays.toString(numbers));

        Thread threadA = new Thread(() -> {
            try {
                FizzBuzz.fizz(numbers);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread threadB = new Thread(() -> {
            try {
                FizzBuzz.buzz(numbers);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread threadC = new Thread(() -> {
            try {
                FizzBuzz.fizzbuzz(numbers);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread threadD = new Thread(() -> {
            try {
                FizzBuzz.number(numbers);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        threadA.start();
        threadB.start();
        threadC.start();
        threadD.start();

    }
}
