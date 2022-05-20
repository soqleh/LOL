package com.skills;
import com.LolCharacers;

public class ActionThread extends Thread {
    protected Thread t;
    protected String threadName;
    protected LolCharacers actionFrom;
    protected LolCharacers actionTo;

    public ActionThread(String name, LolCharacers actionFrom, LolCharacers actionTo) {
        threadName = name;
        System.out.println("Create " + name);
        this.actionFrom = actionFrom;
        this.actionTo = actionTo;
    }

    public void start() {
        System.out.println("Starting " + threadName);
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }

    protected synchronized void runAction(){}
    public void run() {
        runAction();
    }
}
