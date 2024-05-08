import java.util.List;

public class Student {

    private String name;
    private Sex sex;
    private Integer age;
    private List<Subject> subjectList;

    public String getName() {
        return name;
    }

    public Sex getSex() {
        return sex;
    }

    public Integer getAge() {
        return age;
    }

    public List<Subject> getSubjectList() {
        return subjectList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", subjectList=" + subjectList +
                '}';
    }

    public Student(String name, Sex sex, Integer age, List<Subject> subjectList) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.subjectList = subjectList;
    }
}
