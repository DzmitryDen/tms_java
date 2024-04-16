import java.util.Objects;

/**
 * 1.1 Создать класс Person с 3-мя полями (имя, возраст, зарплата).
 * 1.2 Переопределить для этого класса hashCode(придумать свою формулу), toString(чтобы
 * выдавал всю информацию по человеку).
 */

public class Person implements Cloneable {

    private String name;
    private int age;
    private double salary;
    Cat cat;

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name, int age, double salary, Cat cat) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.cat = cat;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, salary) + age / 10 + 25;
    }

    @Override
    public String toString() {
        return "Person: " + name + ";\nage: " + age + ";\nsalary: " + salary + ";\npet's name: " + cat.getName();
    }

    @Override
    public Person clone() throws CloneNotSupportedException {
        Person newPerson = (Person) super.clone();
        newPerson.setName("Dmitry");
        return newPerson;
    }
}