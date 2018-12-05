
import java.util.ArrayList;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cheng
 */
public class Player extends Brawler {
    private String playerName;

    public Player(String playerName, String name, int hp, String img, ArrayList<Power> powerList) {
        super(name, hp, img, powerList);
        this.playerName = playerName;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
    
    @Override
    public void attack(Power power, Enemy enemy){
        Random r = new Random();
        // Generate random number in range [0..1]
        double hit = r.nextInt(101)/100;
        
        // Attack successful !
        if(hit < power.getAccuracy())
            enemy.setHp(enemy.getHp()-power.getDamage());
        
        // Missed, yikes !
    }   
}
