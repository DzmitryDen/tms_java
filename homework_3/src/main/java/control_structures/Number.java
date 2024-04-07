package control_structures;

import java.util.Scanner;

/**
 * Task_3:
 * Напишите программу, которая будет принимать на вход число и на
 * выход будет выводить сообщение четное число или нет.
 * Для определения четности числа используйте операцию получения
 * остатка от деления - операция выглядит так: '% 2').
 */

public class Number {

    public static void main(String[] args) {

        String result;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the integer:");

        int number = scanner.nextInt();

        if (number % 2 == 0) {
            result = "even";
        } else {
            result = "odd";
        }

        System.out.println("Your number is " + result + ".");
    }
}