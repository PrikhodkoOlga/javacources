package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Ivanova I.I", "English");
        Student student = new Student("Petrov O.N");
        teacher.evaluate(student);
    }
}
