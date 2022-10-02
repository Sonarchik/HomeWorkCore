package First;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static First.Time.timer;

public class First {
    private final static int TIME_WORKING = 3600;
    private static int time = 0;
    private static final Object lock = new Object();

    public static void main(String[] args) {

        final ExecutorService service = Executors.newFixedThreadPool(2);
        service.submit(First::runFirstThread);
        service.submit(First::runSecondThread);
    }

    private static void runFirstThread() {
        synchronized (lock) {

            while (time <= TIME_WORKING) {
                time++;
                System.out.println(Thread.currentThread().getName() + " Час с початку запуску: " + timer(time));
                if (time % 5 == 0) {
                    try {
                        lock.wait(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                try {
                    Thread.sleep(990);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    private static void runSecondThread() {
        synchronized (lock) {
            while (time <= TIME_WORKING) {
                System.out.println(Thread.currentThread().getName() + " Пройшло 5 секунд");
                try {
                    lock.wait(30);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
