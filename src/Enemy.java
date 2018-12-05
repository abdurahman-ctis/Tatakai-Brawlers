
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
public class Enemy extends Brawler {

    public Enemy(String name, int hp, String img, ArrayList<Power> powerList) {
        super(name, hp, img, powerList);
    }
    
    @Override
    public void attack(Power power, Brawler b) {
        Random r = new Random();
        // Generate random number in range [0..1]
        double hit = r.nextInt(101)/100;
        
        // Attack successful !
        if(hit < power.getAccuracy())
            b.setHp(b.getHp()-power.getDamage());
        
        // Missed, yikes !
    }
    
}
