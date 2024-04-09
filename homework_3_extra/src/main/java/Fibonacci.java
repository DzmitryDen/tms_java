/**
 * Task_1:
 * Выведите на экран первые 11 членов последовательности Фибоначчи.
 */

public class Fibonacci {
    /*
     * Элементы последовательности Фибоначчи:
     *  0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 ...
     */

    public static void main(String[] args) {

        for (int i = 0, j = 1, n = 0; n < 11; n++) { // n - счетчик количества элементов для вывода

            System.out.print(i + " ");

            int exchange = i; // переменная для обмена
            i = j;
            j = j + exchange;
        }
    }
}
