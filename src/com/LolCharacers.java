package com;

public class LolCharacers {
    private String name = "";
    private double ad, def, hp = -1;
    LolCharacers(String name, double ad, double def, double hp) {
        this.ad = ad;
        this.def = def;
        this.hp = hp;
        this.name = name;
    }
    public synchronized void setHp(double hp) {
        this.hp = hp;
    }

    public synchronized String getName() {
        return name;
    }

    public synchronized double getAd() {
        return ad;
    }

    public synchronized double getDef() {
        return def;
    }

    public synchronized double getHp() {
        return hp;
    }
}