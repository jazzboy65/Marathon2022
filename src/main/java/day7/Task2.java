package day7;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        List<Player> activePlayers = new ArrayList<>();
        Random rand = new Random();
        Player p1 = new Player(rand.nextInt(90)+10);
        Player p2 = new Player(rand.nextInt(90)+10);
        Player p3 = new Player(rand.nextInt(90)+10);
        Player p4 = new Player(rand.nextInt(90)+10);
        Player p5 = new Player(rand.nextInt(90)+10);
        Player p6 = new Player(rand.nextInt(90)+10);
        while(p1.getStamina()>0) {
            p1.run();
        }
        Player.info();
    }
}


