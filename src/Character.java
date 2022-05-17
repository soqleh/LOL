public class Character {
    private String name = "";
    private int ad, def, hp = -1;
    Character(String name, int ad, int def, int hp) {
        this.ad = ad;
        this.def = def;
        this.hp = hp;
        this.name = name;
    }

    public synchronized void setAd(int ad) {
        this.ad = ad;
    }

    public synchronized void setDef(int def) {
        this.def = def;
    }

    public synchronized void setHp(int hp) {
        this.hp = hp;
    }

    public synchronized String getName() {
        return name;
    }

    public synchronized int getAd() {
        return ad;
    }

    public synchronized int getDef() {
        return def;
    }

    public synchronized int getHp() {
        return hp;
    }
}