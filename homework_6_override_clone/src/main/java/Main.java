/**
 * Task
 * 1.1 Создать класс Person с 3-мя полями (имя, возраст, зарплата).
 * 1.2 Переопределить для этого класса hashCode(придумать свою формулу), toString(чтобы
 * выдавал всю информацию по человеку).
 * 1.3 Создать класс Cat и добавить в Person поле этого типа (Cat). Соответственно
 * изменить toString().
 * 1.4 В main создать объект Person, клонировать его, и поменять для копии имя. Проверить
 * в консоли с помощью toString что имена оригинала и копии действительно разные.
 * Сравнить объекты между собой используя equals.
 */

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        Person person = new Person("Andrey", 25, 5200, new Cat("Mars"));

        System.out.println(person);
        System.out.println("hash: " + person.hashCode());
        System.out.println();

        Person personClone = person.clone();

        System.out.println(personClone);
        System.out.println("hash: " + personClone.hashCode());
        System.out.println();

        System.out.println("result of equals: " + person.equals(personClone));
    }
}