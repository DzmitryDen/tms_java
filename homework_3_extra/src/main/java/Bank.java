import java.util.Scanner;

/**
 * Task_2:
 * За каждый месяц банк начисляет к сумме вклада 7% от суммы.
 * Напишите программу, в которую пользователь вводит сумму вклада и
 * количество месяцев. А банк вычисляет конечную сумму вклада с учетом
 * начисления процентов за каждый месяц.
 * Для вычисления суммы с учетом процентов используйте цикл for. Пусть
 * сумма вклада будет представлять тип float.
 */

public class Bank {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter deposit amount:");
        float amount = scanner.nextFloat();

        System.out.println("Enter quantity of months:");
        int quantity = scanner.nextInt();

        for (int i = 1; i <= quantity; i++) {

            amount = amount + amount * 0.07f;

        }

        System.out.println("Final amount: " + amount);
    }
}
