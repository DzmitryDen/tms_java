import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Task
 * Необходимо создать класс Student со следующими полями
 * 	имя
 * 	пол
 * 	возраст
 * 	список занятий, которые студент посещает (любое представление)
 * Необходимо заполнить коллекцию несколькими студентами.
 * Необходимо реализовать следующий функционал
 * 	вывести всех юношей
 * 	найти всех студентов старше 20 лет
 * 	найти всех студентов, которые посещают менее 2 занятий
 * 	найти всех студентов, которые посещают занятие - программирование
 */

public class Main {

    public static void main(String[] args) {

        List<Subject> studentList1 = new ArrayList<>();
        studentList1.add(Subject.PROGRAMMING);
        Student student1 = new Student("Ann", Sex.WOMAN, 18, studentList1);

        List<Subject> studentList2 = new ArrayList<>();
        studentList2.add(Subject.PROGRAMMING);
        studentList2.add(Subject.HISTORY);
        Student student2= new Student("Kate", Sex.WOMAN, 21, studentList2);

        List<Subject> studentList3 = new ArrayList<>();
        studentList3.add(Subject.PHYSICS);
        studentList3.add(Subject.HISTORY);
        studentList3.add(Subject.MATH);
        Student student3 = new Student("Alex", Sex.MAN, 20, studentList3);

        List<Subject> studentList4 = new ArrayList<>();
        studentList4.add(Subject.PHYSICS);
        studentList4.add(Subject.HISTORY);
        studentList4.add(Subject.MATH);
        studentList4.add(Subject.CHEMISTRY);
        Student student4 = new Student("Dmitry", Sex.MAN, 17, studentList4);

        List<Subject> studentList5 = new ArrayList<>();
        studentList5.add(Subject.PROGRAMMING);
        studentList5.add(Subject.PHYSICS);
        studentList5.add(Subject.HISTORY);
        studentList5.add(Subject.MATH);
        studentList5.add(Subject.CHEMISTRY);
        Student student5 = new Student("Andrey", Sex.MAN, 22, studentList5);

//        Заполняем коллекцию студентов:
        List<Student> students = Arrays.asList(student1, student2, student3, student4, student5);

//        Вывести всех юношей:
        List<Student> youngManList = new ArrayList<>();
        for (Student student : students) {
            if(student.getSex() == Sex.MAN) {
                youngManList.add(student);
            }
        }
        System.out.println(youngManList);

//        Найти всех студентов старше 20 лет:
        List<Student> studentOver20List = new ArrayList<>();
        for (Student student : students) {
            if (student.getAge() > 20) {
                studentOver20List.add(student);
            }
        }
        System.out.println(studentOver20List);

//        Найти всех студентов, которые посещают менее 2 занятий
        List<Student> studentOneSubjectList = new ArrayList<>();
        for (Student student : students) {
            List<Subject> subjectList = student.getSubjectList();
            if (subjectList != null && subjectList.size() == 1) {
                studentOneSubjectList.add(student);
            }
        }
        System.out.println(studentOneSubjectList);

//        Найти всех студентов, которые посещают занятие - программирование
        List<Student> studentProgSubjectList = new ArrayList<>();
        for (Student student : students) {
            List<Subject> subjectList = student.getSubjectList();
            if (subjectList != null && !subjectList.isEmpty()) {
                for (Subject subject : subjectList) {
                    if(subject == Subject.PROGRAMMING) {
                        studentProgSubjectList.add(student);
                    }
                }
            }
        }
        System.out.println(studentProgSubjectList);

    }
}
