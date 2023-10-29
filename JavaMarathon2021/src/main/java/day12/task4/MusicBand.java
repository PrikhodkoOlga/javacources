package day12.task4;

import day11.task2.Magician;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<String> members;

    public MusicBand(String name, int year, List<String> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public List<String> getMembers() {
        return members;
    }

    public void setMembers(List<String> members) {
        this.members = members;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public static void transferMembers(MusicBand musicBand1, MusicBand musicBand2){
        musicBand2.members.addAll(musicBand1.getMembers());
        musicBand1.getMembers().clear();
    }
    public void printMembers(){
        if (members.isEmpty()){
            System.out.println("В группе нет участников");
            return;
        }
        System.out.println(this.members);
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                "}";
    }
}
