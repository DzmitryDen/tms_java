import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.*;

/**
 * Task
 * Есть стрим из чисел
 * Необходимо взять n-количество подряд идущий чисел и определить сколько в них четных а сколько не-четных.
 * Так же посчитать сумму четных и нечетных чисел.
 * Результат представить в виде map<Type, Integer>
 */

public class Main {

    public static void main(String[] args) {

        int n = 10; // задаем количество подряд идущих чисел

        // Определяем количество четных и нечетных
        Map<String, Long> collect1 = IntStream.iterate(1, v -> v + 1)
                .limit(n)
                .boxed()
                .collect(groupingBy(v -> v % 2 == 0 ? "CountEven" : "CountOdd", counting()));

        // Находим сумму четных и нечетных соответственно
        Map<String, Long> collect2 = IntStream.iterate(1, v -> v + 1)
                .limit(n)
                .boxed()
                .collect(groupingBy(v -> v % 2 == 0 ? "SumEven" : "SumOdd", summingLong(v -> v)));

        // Общая коллекция значений
        Map<String, Long> commonCollect = new HashMap<>(collect1);
        commonCollect.putAll(collect2);
        System.out.println(commonCollect);
    }
}