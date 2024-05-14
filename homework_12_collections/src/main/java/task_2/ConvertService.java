package task_2;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConvertService {

    public Map<String, Boolean> convert(String[] arr) {

        Map<String, Boolean> map = new HashMap<>();

        for (String string : arr) {
            if (map.containsKey(string)) {
                map.put(string, true);
            } else {
                map.put(string, false);
            }
        }

        return map;
    }
}
