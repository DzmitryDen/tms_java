import java.util.Arrays;
import java.util.Random;

/**
 * Task_3:
 * Создайте массив из произвольных чисел. Создайте новый массив, который будет хранить
 * эти же элементы, но в обратном порядке.
 */

public class Reverse {

    public static void main(String[] args) {

        int[] arrNum = new int[10]; // целочисленный массив из 10 элементов

        Random random = new Random();
        for (int i = 0; i < arrNum.length; i++) { // заполняем массив случайными числами
            arrNum[i] = random.nextInt();
        }

        int[] arrNew = new int[arrNum.length]; // новый массив
        int index = 0; // индекс для элементов нового массива

        for (int i = arrNum.length - 1; i >= 0; i--) {
            arrNew[index] = arrNum[i];
            index++;
        }

        System.out.println("First array: " + Arrays.toString(arrNum));
        System.out.println("Reverse array: " + Arrays.toString(arrNew));
    }
}