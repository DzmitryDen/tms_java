/**
 * Task
 * Создать абстрактный класс Employee для хранения сведений о сотруднике (имени, фамилии, стажа работы и должености).
 * Должность должна быть описана в enum (DIRECTOR, WORKER).
 * <p>
 * Создать класс Worker (наследуется от Employee).
 * <p>
 * Реализовать класс Director (наследуется от Employee).
 * Реализовать метод для назначения сотрудников (как работника, так и директора)
 * под управление директора (на массивах. add(Сотрудник)).
 * <p>
 * 1) Необходимо создать 3 работника и 1 директора. Для каждого сотрудника
 * распечатать полное имя сотрудника и его характеристики.
 * <p>
 * 2) Назначить двух созданных сотрудников под управление директора.
 * Распечатать сведения о директоре (инфо о директоре и об его подчинении).
 * <p>
 * 3) Создать нового директора с одним сотрудником (под управлением)
 * и добавить его под управления существующего директора.
 * <p>
 * 4) Убедиться, что сведения о первом директоре теперь включают сведения о втором,
 * который так же добавлен к нему (и т.д.).
 * <p>
 * 5) Создать сервис, который определяет есть ли у данного директора в подчинении (прямом или косвенном)
 * сотрудник с указанным именем (поиск вглубь)
 */

public class Main {
    public static void main(String[] args) {

        //1.
        // Создать 3 работника и 1 директора. Для каждого сотрудника
        // распечатать полное имя сотрудника и его характеристики.

        System.out.println("TASK_1");

        Worker worker1 = new Worker("Andrey", "Ivanov", 6);
        Worker worker2 = new Worker("Ivan", "Petrov", 3);
        Worker worker3 = new Worker("Dmitry", "Serov", 4);
        Director director1 = new Director("Sergey", "Semenov", 10);

        worker1.printWorkerInfo();
        System.out.println();
        worker2.printWorkerInfo();
        System.out.println();
        worker3.printWorkerInfo();
        System.out.println();
        director1.printDirectorInfo();


        //2.
        // Назначить двух созданных сотрудников под управление директора.
        // Распечатать сведения о директоре (инфо о директоре и об его подчинении).

        System.out.println("TASK_2");

        director1.appointEmployeeUnderControl(worker1);
        director1.appointEmployeeUnderControl(worker2);
        director1.printDirectorInfo();


        //3.
        // Создать нового директора с одним сотрудником (под управлением)
        // и добавить его под управления существующего директора.

        //4.
        // Убедиться, что сведения о первом директоре теперь включают сведения о втором.

        System.out.println("TASK_3-4");

        Director director2 = new Director("Oleg", "Solodko", 8);
        director2.appointEmployeeUnderControl(worker3);
        director1.appointEmployeeUnderControl(director2);
        director2.printDirectorInfo();
        director1.printDirectorInfo();


        //5.
        // Создать сервис, который определяет есть ли у данного директора
        // в подчинении (прямом или косвенном) сотрудник с указанным именем.

        System.out.println("TASK_5");

        CheckEmployeeService checkEmployeeService = new CheckEmployeeService();
        checkEmployeeService.checkEmployee(director1, "Oleg Solodko");
    }
}