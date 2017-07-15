package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Anton Ilchenko on 15.07.2017.
 */
public class Player implements ISavable {
    private String name;
    private int hitPoints;
    private int strenght;
    private String weapon;

    public Player(String name, int hitPoints, int strenght) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strenght = strenght;
        this.weapon = "Machine gun";
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrenght() {
        return strenght;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public void setStrenght(int strenght) {
        this.strenght = strenght;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Player{ " +
                "name = " + name +
                ", hitPoints = " + hitPoints +
                ", strenght = " + strenght +
                ", weapon = " + weapon +
                "}";
    }

    @Override
    public List<String> write() {
        List<String> values = new ArrayList<String>();
        values.add(0, this.name);
        values.add(1, "" + this.hitPoints);
        values.add(2, "" + this.strenght);
        values.add(3, this.weapon);
        return values;

    }

    @Override
    public void read(List<String> saveValues) {
        if (saveValues != null && saveValues.size() > 0) {
            this.name = saveValues.get(0);
            this.hitPoints = Integer.parseInt(saveValues.get(1));
            this.strenght = Integer.parseInt(saveValues.get(2));
            this.weapon = saveValues.get(3);
        }
    }


}
