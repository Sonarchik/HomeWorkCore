package Second;

import java.util.Arrays;
import java.util.concurrent.Semaphore;

class FizzBuzz {
    private static final Semaphore SEMAPHORE = new Semaphore(3, true);

    public FizzBuzz() {
    }

    public static void fizz(String[] numbers) throws InterruptedException {
        SEMAPHORE.acquire();
        for (int i = 2; i < numbers.length; i = i + 3) {
            if ((i + 1) % 15 != 0 & (i + 1) % 3 == 0) {
                numbers[i] = "fizz";
            }
        }
        SEMAPHORE.release();
    }

    public static void buzz(String[] numbers) throws InterruptedException {
        SEMAPHORE.acquire();
        for (int i = 4; i < numbers.length; i = i + 5) {
            if ((i + 1) % 15 != 0 & (i + 1) % 5 == 0) {
                numbers[i] = "buzz";
            }
        }
        SEMAPHORE.release();
    }

    public static void fizzbuzz(String[] numbers) throws InterruptedException {
        SEMAPHORE.acquire();
        for (int i = 14; i < numbers.length; i = i + 15) {
            if ((i + 1) % 15 == 0) {
                numbers[i] = "fizzbuzz";
            }
        }
        SEMAPHORE.release();
    }

    public static void number(String[] numbers) throws InterruptedException {
        Thread.sleep(10);
        SEMAPHORE.acquire();
        System.out.println("Видозмінений рядок: " + Arrays.toString(numbers));
        SEMAPHORE.release();
    }
}




