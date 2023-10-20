package day12.task3;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        List<MusicBand> musicBandList = new ArrayList<>(
                Arrays.asList(
                        new MusicBand("Skillet", 1996),
                        new MusicBand("Rammstein", 1994),
                        new MusicBand("Linkin Park", 1996),
                        new MusicBand("Звери", 2000),
                        new MusicBand("My Chemical Romance", 2001),
                        new MusicBand("The hatters", 2016),
                        new MusicBand("30 Seconds to Mars", 1998),
                        new MusicBand("Imagine Dragons", 2008),
                        new MusicBand("GAYAZOV$ BROTHER$", 2013),
                        new MusicBand("Nirvana", 1987)));

        System.out.println(musicBandList);
        Collections.shuffle(musicBandList);
        System.out.println("Группы, основанные после 2000:");
        List<MusicBand> bandsAfter2000List = new ArrayList<>(groupsAfter2000(musicBandList));
        System.out.println(bandsAfter2000List);
    }
    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands){
        List<MusicBand> newList = new ArrayList<>();
        for (MusicBand musicBand : bands) {
            if (musicBand.getYear() > 2000){
                newList.add(musicBand);
            }

        }
        return newList;
    }

}
