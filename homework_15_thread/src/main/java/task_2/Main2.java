package task_2;

/**
 * Task
 * Есть массив целых чисел.
 * Необходимо создать два потока - один из которых будет считать максимальное значение, а второй - минимальное.
 * Запустить оба потока и дождаться их окончания. Вывести на экран результат вычислений.
 */

public class Main2 {

    public static void main(String[] args) throws InterruptedException {

        int[] num = {12, 34, 435, 67, 22, 45, 11, 125, 0, -16, -2}; // задан массив целых чисел

        Thread threadMin = new Thread(() -> {
            MinMaxService service = new MinMaxService();
            System.out.println("Min: " + service.findMin(num));
        });

        Thread threadMax = new Thread(() -> {
            MinMaxService service = new MinMaxService();
            System.out.println("Max: " + service.findMax(num));
        });

        threadMin.start();
        threadMin.join();

        threadMax.start();
        threadMax.join();
    }
}
