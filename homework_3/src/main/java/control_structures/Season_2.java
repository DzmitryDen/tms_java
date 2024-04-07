package control_structures;

/**
 * Task_2:
 * Написать программу для вывода названия поры года по номеру
 * месяца.
 * При решении используйте оператор if-else-if.
 */

public class Season_2 {

    public static void main(String[] args) {

        // set the number of month
        int monthNum = 1;

        String month;

        if (monthNum == 12 || monthNum == 1 || monthNum == 2) {
            month = "Winter";
        } else if (monthNum == 3 || monthNum == 4 || monthNum == 5) {
            month = "Spring";
        } else if (monthNum == 6 || monthNum == 7 || monthNum == 8) {
            month = "Summer";
        } else if (monthNum == 9 || monthNum == 10 || monthNum == 11) {
            month = "Autumn";
        } else {
            month = "there is no such month";
        }

        System.out.println(month);
    }
}