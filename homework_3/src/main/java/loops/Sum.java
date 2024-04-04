package loops;

import java.util.Scanner;

/**
 * Task_3:
 * Напишите программу, где пользователь вводит любое целое
 * положительное число. А программа суммирует все числа от 1 до
 * введенного пользователем числа.
 * Для ввода числа воспользуйтесь классом Scanner.
 */

public class Sum {

    public static void main(String[] args) {

        long result = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a positive integer:");

        int num = scanner.nextInt();

        for (int i = 1; i <= num; i++) { // суммируем включая введенное число

            result += i;

        }

        System.out.println("Amount: " + result);
    }
}