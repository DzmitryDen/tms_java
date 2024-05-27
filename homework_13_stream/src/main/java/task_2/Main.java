package task_2;

import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        // 1. Найти среднее значение первых 10 чисел.
        double asDouble = IntStream.iterate(1, v -> v + 1)
                .limit(10)
                .average().getAsDouble();
        System.out.println("Среднее значение первых 10 чисел: " + asDouble);

        // 2. Пропустить 5 чисел и вывести следующие 10 чисел, которые делятся на 3 без остатка
        IntStream.iterate(1, v -> v + 1)
                .skip(5)
                .filter(n -> n % 3 == 0)
                .limit(10)
                .forEach(System.out::println);

        // 3. Посчитать сумму 20 подряд идущих чисел
        int sum = IntStream.iterate(1, v -> v + 1)
                .limit(20)
                .sum();
        System.out.println("Сумма 20-ти чисел: " + sum);
    }
}
