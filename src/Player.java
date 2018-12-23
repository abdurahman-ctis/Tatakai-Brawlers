
import java.util.ArrayList;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Tatakai Masters
 */
public class Player extends Brawler {

    private String playerName;

    public Player(String playerName, String name, int hp, String img, ArrayList<Power> powerList) {
        super(name, hp, img, powerList);
        this.playerName = playerName;
    }
    
    public Player(String playerName, Brawler b){
        super(b.getName(), b.getHp(), b.getImg(), b.getPowerList());
        this.playerName = playerName;
    }

    public String getPlayerName() {
        return playerName;
    }

    @Override
    public void attack(Power power, Brawler b) {
        Random r = new Random();
        // Generate random number in range [0..1]
        double hit = r.nextInt(101) / 100;

        // Attack successful !
        if (hit < power.getAccuracy()) {
            b.setHp(b.getHp() - power.getDamage());
        }

        // Missed, yikes !
    }

    public void cryForHelp(Enemy enemy) {
        Random r = new Random();
        // Generate random hp for player
        int newHp = r.nextInt(100);
        System.out.println(newHp);
        this.setHp(newHp);
        // Generate random hp for enemy
        newHp = r.nextInt(this.getHp());
        System.out.println(newHp);
        enemy.setHp(newHp);
    }

    @Override
    public String toString() {
        return "Player Name: " + playerName + "\n" + super.toString();
    }

}
