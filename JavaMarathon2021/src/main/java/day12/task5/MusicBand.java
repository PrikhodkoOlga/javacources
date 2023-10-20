package day12.task5;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> members;

    public MusicBand(String name, int year, List<MusicArtist> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public List<MusicArtist> getMembers() {
        return members;
    }

    public void setMembers(List<MusicArtist> members) {
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
        List <MusicArtist> membersList1 = musicBand1.getMembers();
        for (MusicArtist member: membersList1) {
            musicBand2.members.add(member);
        }
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
