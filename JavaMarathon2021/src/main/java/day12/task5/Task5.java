package day12.task5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> members1 = new ArrayList<>(
                Arrays.asList(
                        new MusicArtist("Grace Slick", 20),
                        new MusicArtist("Grace Slick", 30),
                        new MusicArtist("Grace Slick", 40)));
        MusicBand band1 = new MusicBand("Jefferson Airplane", 1965, members1);

        List<MusicArtist> members2 = new ArrayList<>(
                Arrays.asList(
                        new MusicArtist("John Lennon", 35),
                        new MusicArtist("Paul McCartney", 32)));
        MusicBand band2 = new MusicBand("The Beatles", 1960, members2);

        band1.printMembers();
        band2.printMembers();

        MusicBand.transferMembers(band1, band2);
        band1.printMembers();
        band2.printMembers();
    }
}
