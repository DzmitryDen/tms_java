package task_1;

/**
 * Task
 * Создать поток используя два способа - через наследованное и имплементируя интерфейс Runnable
 * Оба потока должны стартовать, после чего основной поток должен дождаться их завершения и прекратить работу.
 */

public class Main1 {

    public static void main(String[] args) throws InterruptedException {

        Test1Thread thread1 = new Test1Thread("Test_1");
        thread1.start();
        thread1.join();

        Thread thread2 = new Thread(() -> {
            Test2Thread test2Tread = new Test2Thread("Test_2");
            System.out.println(test2Tread.getValue());
        });
        thread2.start();
        thread2.join();

        System.out.println("main finished");
    }
}
