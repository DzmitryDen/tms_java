import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

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

        Map<String, Integer> map = new HashMap<>();

        int countEven = (int) IntStream.iterate(1, v -> v + 1)
                .limit(n)
                .filter(v -> v % 2 == 0)
                .count(); // количество четных
        int countOdd = n - countEven; // количество нечетных

        int sumCommon = IntStream.iterate(1, v -> v + 1)
                .limit(n)
                .sum(); // общая сумма n-чисел

        int sumEven = IntStream.iterate(1, v -> v + 1)
                .limit(n)
                .filter(v -> v % 2 == 0)
                .sum(); // сумма четных
        int sumOdd = sumCommon - sumEven; // сумма нечетных

        map.put("CountEven", countEven);
        map.put("CountOdd", countOdd);
        map.put("SumEven", sumEven);
        map.put("SumOdd", sumOdd);

        map.forEach((k,v) -> System.out.println(k + ":" + v));
    }
}
