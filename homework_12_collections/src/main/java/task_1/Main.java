package task_1;

import java.util.*;

/**
 * Task
 * Создать коллекцию пользователей
 * У каждого пользователя есть следующие поля:
 * имя (не уникальное)
 * стаж работы (пусть будет уникальное для всех)
 * список задач (любое представление - можно строками, можно обьектами)
 * Найти всех пользователей, у который количество задач больше 2
 * Вывести всех пользователей по стажу работы (от большего к меньшему)
 * Вывести только уникальные имена пользователей
 */

public class Main {

    public static void main(String[] args) {

        Set<User> userSet = new HashSet<>(); // список пользователей

        // создаем пользователей
        List<Task> tasks1 = new ArrayList<>();
        tasks1.add(Task.TASK1);
        User user1 = new User("Ivan", 1, tasks1);

        List<Task> tasks2 = new ArrayList<>();
        tasks2.add(Task.TASK1);
        tasks2.add(Task.TASK2);
        User user2 = new User("Ivan", 2, tasks2);

        List<Task> tasks3 = new ArrayList<>();
        tasks3.add(Task.TASK1);
        tasks3.add(Task.TASK2);
        tasks3.add(Task.TASK3);
        User user3 = new User("Sergey", 4, tasks3);

        List<Task> tasks4 = new ArrayList<>();
        tasks4.add(Task.TASK1);
        tasks4.add(Task.TASK2);
        tasks4.add(Task.TASK3);
        tasks4.add(Task.TASK4);
        User user4 = new User("Dmitry", 5, tasks4);

        List<Task> tasks5 = new ArrayList<>();
        tasks5.add(Task.TASK1);
        tasks5.add(Task.TASK2);
        tasks5.add(Task.TASK3);
        User user5 = new User("Dmitry", 3, tasks5);

        // добавляем пользователей в список
        userSet.add(user1);
        userSet.add(user2);
        userSet.add(user3);
        userSet.add(user4);
        userSet.add(user5);

        // 1. Найти всех пользователей, у который количество задач больше 2
        System.out.println("More than two tasks:");
        Set<User> userSet1 = new HashSet<>();

        for (User user : userSet) {
            if (user.getTasks().size() > 2) {
                userSet1.add(user);
            }
        }
        if (userSet1.isEmpty()) {
            System.out.println("Пользователей с количеством задач более двух нет\n");
        } else {
            System.out.println(userSet1 + "\n");
        }

        // 2. Вывести всех пользователей по стажу работы (от большего к меньшему)
        System.out.println("Sorted by experience:");
        Set<User> userSet2 = new TreeSet<>(new UserExperienceComparator());
        userSet2.addAll(userSet);
        System.out.println(userSet2 + "\n");

        // 3. Вывести только уникальные имена пользователей
        System.out.println("Unique names:");
        List<String> allNames = new ArrayList<>(); // список всех имен
        List<String> uniqueNames = new ArrayList<>(); // список уникальных имен

        for (User user : userSet) {
            if (!user.getName().isEmpty() && user.getName() != null) {
                allNames.add(user.getName());
            }
        }

        for (String name : allNames) {
            if (Collections.frequency(allNames, name) == 1) {
                uniqueNames.add(name);
            }
        }

        System.out.println(uniqueNames);
    }
}
