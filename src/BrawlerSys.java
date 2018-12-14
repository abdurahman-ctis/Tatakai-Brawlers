
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
public class BrawlerSys {
    private static ArrayList<Brawler> brawlers = new ArrayList();
    
    public static boolean addBrawler(Brawler brawler){
        for(Brawler i: brawlers){
            if(i.getName().equals(brawler.getName()))
                return false;
        }
        brawlers.add(brawler);
        return true;
    }
    
    public static boolean deleteBrawler(String name){
        for(int i = 0; i < brawlers.size(); i++)
            if(brawlers.get(i).getName().equals(name)){
                brawlers.remove(i);
                return true;
            }
        return false;
    }
    
    public static Brawler searchBrawler(String name){
        for(Brawler i: brawlers){
            if(i.getName().equals(name))
                return i;
        }
        return null;
    }
    
    public static ArrayList<Brawler> displayBrawlers(){
        return brawlers;
    }
}
