package users;

/**
 * Task
 * Необходимо создать класс User со следующими полями
 * 	имя - строковой параметр
 * 	профессия - enum (DIRECTOR, WORKER, HR)
 * 	стаж работы - число
 * Так же надо создать метод который будет выводить зарплату данного пользователя
 * Подсчет зп должен учитывать стаж работы и профессию (1000 * стаж работы * коэффициент профессии)

 * Создайте несколько пользователей с разными параметрами
 * Выведете зп каждого сотрудника

 * Создайте еще один метод подсчета зп, но он должен принимать параметр - доп оплата
 * Его задача - подсчитывать ЗП и добавлять к ней доп плату
 * Проверить правильность работы данного метода
 */

public class Main {

    public static void main(String[] args) {

        // users with usual salary
        User director = new User("Ivanov", Profession.DIRECTOR, 10);
        User hr = new User("Petrova", Profession.HR, 8);
        User worker = new User("Popov", Profession.WORKER, 3);

        System.out.println("Users with usual salary");
        System.out.println(director.getUserInfoWithoutBonus(director));
        System.out.println(hr.getUserInfoWithoutBonus(hr));
        System.out.println(worker.getUserInfoWithoutBonus(worker) + "\n");

        // users with salary + bonus
        User director_1 = new User("Sidorov", Profession.DIRECTOR, 12);
        User hr_1 = new User("Semenova", Profession.HR, 10);
        User worker_1 = new User("Karpov", Profession.WORKER, 7);

        System.out.println("Users with salary + bonus");
        System.out.println(director_1.getUserInfoWithBonus(director_1));
        System.out.println(hr_1.getUserInfoWithBonus(hr_1));
        System.out.println(worker_1.getUserInfoWithBonus(worker_1) + "\n");
    }
}