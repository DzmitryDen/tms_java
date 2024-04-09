/**
 * Task_3:
 * Напишите программу, которая выводит на консоль таблицу умножения.
 */

public class Multiplication {

    public static void main(String[] args) {

        for (int i = 1; i < 11; i++) {

            for (int j = 1; j < 11; j++) {

                int multi = i * j;

                if (multi < 10) {
                    System.out.print(multi + "   ");
                } else {
                    System.out.print(multi + "  ");
                }
            }

            System.out.println();
        }
    }
}
