import java.util.Scanner;

/**
 * Task_0:
 * Создайте массив целых чисел. Напишете программу, которая выводит
 * сообщение о том, входит ли заданное число в массив или нет.
 * Пусть число для поиска задается с консоли (класс Scanner).
 * Не использовать методы класса Arrays.
 */

public class Content {

    public static void main(String[] args) {

        int[] arrNum = {10, 12, 4, 0, 7, 6, 9, 5, 5, 12}; // создаем массив целых чисел из 10 элементов

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the integer:");
        int n = scanner.nextInt();
        scanner.close();

        int count = 0; // счетчик совпадений

        for (int num : arrNum) {
            if (n == num) {
                count++;
            }
        }

        String message_1 = "Our array doesn't contain this number.";
        String message_2 = "Our array contains the number: " + count + " times";

        String message = count == 0 ? message_1 : message_2;

        System.out.println(message);
    }
}