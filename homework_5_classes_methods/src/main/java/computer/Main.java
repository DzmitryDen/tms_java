package computer;

/**
 * Task_2
 * Создать класс для описания компьютера, в этом классе должны быть
 * поля: стоимость, модель(строковый тип), RAM и HDD.
 * Для полей RAM и HDD следует создать свои собственные классы.
 * Классы для RAM и HDD должны иметь конструктор по умолчанию и
 * конструктор со всеми параметрами.
 * Класс RAM имеет поля "название" и "объем".
 * Класс HDD имеет поля "название", "объем" и "тип" (внешний или
 * внутренний).
 * Класс Computer должен иметь два конструктора:
 * - первый - с параметрами стоимость и модель,
 * - второй - со всеми полями.
 * При создании объекта "компьютер" с помощью первого конструктора
 * должны создаваться поля RAM и HDD с помощью конструкторов по
 * умолчанию.
 * В каждом из классов предусмотреть методы для вывода полной
 * информации (вывод всех полей и всех значений).
 * Тестовый сценарий для проверки:
 * создать объект "компьютер 1" с помощью первого конструктора и
 * вывести информацию на экран;
 * создать объект "компьютер 2" с помощью второго конструктора и
 * вывести информацию на экран.
 */

public class Main {
    public static void main(String[] args) {

        //        create RAM object
        Ram ram = new Ram("ACER", 512);

        //        create HDD object
        Hdd hdd = new Hdd("WD", 1000, "external");

        //        create computer object: computer1, computer2
        Computer computer1 = new Computer(1000.0, "HP");
        Computer computer2 = new Computer(1500.0, "DELL", ram, hdd);

        computer1.getComputerInformation();
        computer2.getComputerInformation();
    }
}