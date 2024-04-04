package control_structures;

import java.util.Scanner;

/**
 * Task_4:
 * Для введенного числа t (температура на улице) вывести
 * Если t>–5, то вывести «Тепло».
 * Если –5>= t > –20, то вывести «Нормально».
 * Если –20>= t, то вывести «Холодно».
 */

public class Temperature {

    public static void main(String[] args) {

        String result = "";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите температуру:");

        double temperature = scanner.nextDouble();

        if (temperature > -5) {
            result = "Тепло";
        }

        if (temperature <= -5 && temperature > -20) {
            result = "Нормально";

        }
        if (temperature <= -20) {
            result = "Холодно";
        }

        System.out.println(result);
    }
}