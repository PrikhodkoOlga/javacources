package day7;

public class Player {
    public static final  int MAX_STAMINA = 100;
    public static final  int MIN_STAMINA = 0;
    private static int countPlayers;
    private int stamina;

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers < 6)
            countPlayers++;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public int getStamina() {
        return stamina;
    }

    public void run(){
        if (this.stamina == MIN_STAMINA) {
            System.out.println("Игрок устал и ушел с поля");
            return;
        }
        this.stamina--;
        if (this.stamina == MIN_STAMINA) {
            countPlayers--;
            System.out.println("Игрок уходит с поля");
        }
    }

    public static void info(){
        int currCountPlayers = 6 - countPlayers;
        if (currCountPlayers > 0)
            System.out.println("Команды неполные. На поле еще есть " + currCountPlayers + " свободных мест");
        else
            System.out.println("На поле нет свободных мест");
    }
}
