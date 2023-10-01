package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random rand = new Random();
        Player player1 = new Player(rand.nextInt(11) + 90);
        Player player2 = new Player(rand.nextInt(11) + 90);
        Player player3 = new Player(rand.nextInt(11) + 90);
        Player player4 = new Player(rand.nextInt(11) + 90);
        Player.info();
        Player player5 = new Player(rand.nextInt(11) + 90);
        Player player6 = new Player(5);//rand.nextInt(10) + 90);
        Player.info();
        Player player7 = new Player(rand.nextInt(11) + 90);
        Player player8 = new Player(rand.nextInt(11) + 90);
        System.out.println(Player.getCountPlayers());
        Player.info();
        player6.run();
        player6.run();
        player6.run();
        player6.run();
        player6.run();
        System.out.println(Player.getCountPlayers());
    }
}
