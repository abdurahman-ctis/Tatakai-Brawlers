
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tatakai Masters
 */
public abstract class Brawler implements NoisyInterface{
    protected String name;
    protected int hp;
    protected String img;
    protected ArrayList<Power> powerList = new ArrayList();
    public static int brawlerCount = 0;

    public Brawler(String name, int hp, String img, ArrayList<Power> powerList) {
        this.name = name;
        this.hp = hp;
        this.img = img;
        this.powerList = powerList;
        brawlerCount++;
    }

    public ArrayList<Power> getPowerList() {
        return powerList;
    }

    public String getImg() {
        return img;
    }

    public static int getBrawlerCount() {
        return brawlerCount;
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

    @Override
    public void makeSomeNoise() {
        int random = (int) (Math.random()*3);
        try {
            InputStream i = new FileInputStream("noise/"+random+".wav");
            try {
                AudioStream s = new AudioStream(i);
                AudioPlayer.player.start(s);

            } catch (IOException ex) {
                Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (FileNotFoundException ex) {
            System.out.println("NOT FOUND");
        }
    }
    
}
