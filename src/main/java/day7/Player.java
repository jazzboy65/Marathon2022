package day7;


public class Player {
    private int stamina;
    private static final int MAX_STAMINA = 100;
    private static final int MIN_STAMINA = 0;
    private static int countPlayers;
    private boolean active;

    public Player(int stamina) {
        this.stamina = stamina;
        countPlayers++;
    }


    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        if (countPlayers > 6) countPlayers = 6;
        if (countPlayers <= 0) countPlayers = 0;
        return countPlayers;
    }

    public void run() {
        if (stamina == MIN_STAMINA) {
            return;
        }

        stamina--;

        if (stamina == MIN_STAMINA) {
            countPlayers--;
        }
    }

    public static void info() {
        if (countPlayers < 6)
            System.out.println("Команды неполные. На поле еще есть " + (6 - countPlayers) + " свободных мест");
        else System.out.println("На поле нет свободных мест");
    }
}
