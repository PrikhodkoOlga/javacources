package day9.Task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите наименование группы для студента");
        Student student = new Student("Петров", in.next());
        System.out.println(student.getGroupName());
        student.printInfo();
        System.out.println("Введите наименование предмета для преподавателя");
        Teacher teacher = new Teacher("Иванов", in.next());
        System.out.println(teacher.getSubjectName());
        teacher.printInfo();
    }
}
