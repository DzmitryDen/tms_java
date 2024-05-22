package task_2;

/**
 * Task
 * На вход поступает массив строк, верните Map<String, Boolean>, где каждая отдельная
 * строка является ключом, и ее значение равно true, если эта строка встречается в массиве
 * 2 или более раз. Пример:
 * wordMultiple(["a", "b", "a", "c", "b"]) → {"a": true, "b": true, "c": false}
 * wordMultiple(["c", "b", "a"]) → {"a": false, "b": false, "c": false}
 * wordMultiple(["c", "c", "c", "c"]) → {"c": true}
 */

public class Main {

    public static void main(String[] args) {

        String[] arr = new String[]{"a", "b", "a", "c", "b"};
        String[] arr1 = new String[]{"c", "b", "a"};
        String[] arr2 = new String[]{"c", "c", "c", "c"};

        ConvertService convertService = new ConvertService();

        System.out.println(convertService.convert(arr));
    }
}
