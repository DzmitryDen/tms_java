import java.util.Arrays;
import java.util.Random;

/**
 * Task_2:
 * Создайте и заполните массив случайным числами и выведете
 * максимальное, минимальное и среднее значение
 */

public class Value {

    public static void main(String[] args) {

        int[] arrNum = new int[10]; // целочисленный массив из 10 элементов

        Random random = new Random();
        for (int i = 0; i < arrNum.length; i++) { // заполняем массив случайными числами
            arrNum[i] = random.nextInt();
        }

        int min = arrNum[0];
        int max = arrNum[0];
        int sum = arrNum[0]; // сумма элементов массива
        double overage; // среднее значение

        for (int i = 1; i < arrNum.length; i++) {
            if (arrNum[i] < min) {
                min = arrNum[i];
            }

            if (arrNum[i] > max) {
                max = arrNum[i];
            }

            sum += arrNum[i];
        }

        overage = (double) sum / arrNum.length;

        System.out.println("Our array: " + Arrays.toString(arrNum));
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Overage: " + overage);
    }
}