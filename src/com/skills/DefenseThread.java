package com.skills;

import com.LolCharacers;

public class DefenseThread extends ActionThread{
    public DefenseThread(String name, LolCharacers actionFrom, LolCharacers actionTo) {
        super(name, actionFrom, actionTo);
    }

    private synchronized void calculateDf(String callFrom, LolCharacers actionFrom, LolCharacers actionTo) {
        System.out.printf("-".repeat(30) + "\n%s %s 캐릭터가 수비하였습니다. \n", callFrom, actionFrom.getName());
        //TO DO
    }
    @Override
    protected synchronized void runAction() {
        try {
            while (actionFrom.getHp() > 0 && actionTo.getHp() > 0) {
                calculateDf("[" + threadName + "]", actionFrom, actionTo);
                Thread.sleep(230);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + threadName + " interrupted.");
        }

    }
}
