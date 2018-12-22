/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tatakai Masters
 */
public class Power {
    private String name;
    private int damage;
    private String powerInfo;
    private double accuracy;

    public Power(String name, int damage, String powerInfo, double accuracy) {
        this.name = name;
        this.damage = damage;
        this.powerInfo = powerInfo;
        this.accuracy = accuracy;
    }

    public String getName() {
        return name;
    }

    public String getPowerInfo() {
        return powerInfo;
    }

    public double getAccuracy() {
        return accuracy;
    }

    public int getDamage() {
        return damage;
    }
}
