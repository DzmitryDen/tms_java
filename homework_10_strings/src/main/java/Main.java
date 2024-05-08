import java.util.Scanner;

/**
 * Task
 * Написать программу со следующим функционалом:
 * На вход передать строку (будем считать, что это номер документа).
 * Номер документа имеет формат xxxx-yyy-xxxx-yyy-xyxy, где x — это число,
 * а y — это буква.
 * - Вывести на экран в одну строку два первых блока по 4 цифры.
 * - Вывести на экран номер документа, но блоки из трех букв заменить
 * на *** (каждая буква заменятся на *).
 * - Вывести на экран только одни буквы из номера документа в
 * формате yyy/yyy/y/y в нижнем регистре.
 * - Вывести на экран буквы из номера документа в формате
 * "Letters:yyy/yyy/y/y" в верхнем регистре(реализовать с помощью
 * класса StringBuilder).
 * - Проверить содержит ли номер документа последовательность abc и
 * вывети сообщение содержит или нет(причем, abc и ABC считается
 * одинаковой последовательностью).
 * - Проверить начинается ли номер документа с последовательности
 * 555.
 * - Проверить заканчивается ли номер документа на
 * последовательность 1a2b.
 * Все эти методы реализовать в отдельном классе в статических методах,
 * которые на вход (входным параметром) будут принимать вводимую на
 * вход программы строку..
 */

public class Main {

    public static void main(String[] args) {

        System.out.println("Введите № документа в формате xxxx-yyy-xxxx-yyy-xyxy, где x — это число, а y — это буква");
        System.out.println("Например: 1234-AbC-5678-dEf-9G0h");

        Scanner scanner = new Scanner(System.in);
        String docNumber = scanner.next();

        StringOperations.printTwoDigitalBlocks(docNumber);
        StringOperations.replaceBlocks(docNumber);
        StringOperations.printOnlyLettersInLowerCaseFormat(docNumber);
        StringOperations.printOnlyLettersInUpperCaseFormat(docNumber);
        StringOperations.checkContainsSubstringAbc(docNumber);
        StringOperations.checkStartSubstring555(docNumber);
        StringOperations.checkEndSubstring1a2b(docNumber);
    }
}
