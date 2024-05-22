package task_3;

/**
 * Task
 * Создать поток демон и проверить его работу
 */

public class Main3 {

    public static void main(String[] args) {

        Thread thread = new Thread(() -> {
            System.out.println("working test");
            try {
                Thread.sleep(2_000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("!!! never be print"); // не будет напечатано, т.к. программа закончит свою работу до завершения Daemon потока
        });

        thread.setDaemon(true); // объявляем поток Daemon
        thread.start(); // запускаем поток

        System.out.println(Thread.currentThread().getName());
    }
}
