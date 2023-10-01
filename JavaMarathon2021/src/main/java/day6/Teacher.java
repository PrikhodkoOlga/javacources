package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String subject;
    public Teacher(String name, String subject){
        this.name = name;
        this.subject = subject;
    }
    public void evaluate(Student student){
        Random rand = new Random();
        int mark = rand.nextInt(6 - 2) + 2;
        String markString = "";
        switch (mark){
            case 5:
                markString = "отлично";
                    break;
            case 4:
                markString = "хорошо";
                break;
            case 3:
                markString = "удовлетворительно";
                break;
            default:
                markString = "неудовлетворительно";
                break;
        }
        System.out.println("Преподаватель " + this.name +  " оценил студента с именем " + student.getName() + " по предмету " + this.subject + " на оценку " + markString);
    }
}
