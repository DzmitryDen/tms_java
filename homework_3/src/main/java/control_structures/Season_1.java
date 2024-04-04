package control_structures;

/**
 * Task_1:
 * Написать программу для вывода названия поры года по номеру
 * месяца.
 * При решении используйте оператор switch-case.
 */

public class Season_1 {

    public static void main(String[] args) {

        // set the number of month
        int monthNum = 1;

        String month;

        switch (monthNum) {
            case 12, 1, 2:
                month = "Winter";
                break;
            case 3, 4, 5:
                month = "Spring";
                break;
            case 6, 7, 8:
                month = "Summer";
                break;
            case 9, 10, 11:
                month = "Autumn";
                break;
            default:
                month = "there is no such month";

        }

        System.out.println(month);
    }
}