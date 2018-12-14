
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tatakai Masters
 */
public abstract class Brawler {
    protected String name;
    protected int hp;
    protected String img;
    protected ArrayList<Power> powerList = new ArrayList();

    public Brawler(String name, int hp, String img, ArrayList<Power> powerList) {
        this.name = name;
        this.hp = hp;
        this.img = img;
        this.powerList = powerList;
    }

    public String getName() {
        return name;
    }
    
    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    } 
    
    public abstract void attack(Power p, Brawler b);
    
    @Override
    public String toString() {
        return "\nName: " + name + "\nHP: " + hp + "\n";
    }
    
}
