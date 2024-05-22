package task_4;

/**
 * Task
 * Есть два потока - один выводит в бесконечном цикле 3 раза цифру "1" (3 вызова System.out.println),
 * а второй аналогично - цифру "2". Предусмотреть небольшую задержку.
 * Задача - сделать синхронизацию потоков (пока один не закончит вывод трех чисел, второй будет ждать - не будет перемешивания)
 * Проверить что в консоли вы получите поочередное выполнение потоков.
 */

public class Main4 {

    public static void main(String[] args) {

        PrintService print = new PrintService();


        Thread thread1 = new Thread(() -> {

            while (true) { // бесконечный цикл
                try {
                    print.print1();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread thread2 = new Thread(() -> { // бесконечный цикл

            while (true) {
                try {
                    print.print2();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        thread1.start();
        thread2.start();

    }
}