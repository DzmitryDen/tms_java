package task_2;

import java.util.Arrays;
import java.util.OptionalInt;

public class MinMaxService {

    public int findMin (int[] n) {
        OptionalInt min = Arrays.stream(n).min();
        return min.getAsInt();
    };

    public int findMax(int[] n) {

        OptionalInt max = Arrays.stream(n).max();
        return max.getAsInt();
    }
}
