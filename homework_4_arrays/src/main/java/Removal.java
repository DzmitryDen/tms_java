import java.util.Arrays;
import java.util.Scanner;

/**
 * Task_1:
 * Создайте массив целых чисел. Удалите все вхождения заданного
 * числа из массива.
 * Пусть число задается с консоли (класс Scanner). Если такого числа нет -
 * выведите сообщения об этом.
 * В результате должен быть новый массив без указанного числа.
 */

public class Removal {

    public static void main(String[] args) {

        int[] arrNum = {10, 12, 4, 0, 7, 6, 9, 5, 5, 12}; // создаем массив целых чисел из 10 элементов
        int[] arrNew; // новый массив

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
        String message_2 = "Our first array: ";
        String message_3 = "Our new array: ";

        if (count == 0) {
            System.out.println(message_1);
        } else {
            arrNew = new int[arrNum.length - count]; // задаем размерность нового массива

            int index = 0; // индекс для элементов нового массива
            for (int item : arrNum) { // заполняем новый массив
                if (item != n) {
                    arrNew[index] = item;
                    index++;
                }
            }
            System.out.println(message_2 + Arrays.toString(arrNum));
            System.out.println(message_3 + Arrays.toString(arrNew));
        }
    }
}