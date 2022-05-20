package com.skills;
import com.LolCharacers;

public class AttackThread extends ActionThread {
    public AttackThread(String name, LolCharacers actionFrom, LolCharacers actionTo) {
        super(name, actionFrom, actionTo);
    }

    private synchronized void calculateHp(String callFrom, LolCharacers actionFrom, LolCharacers actionTo) {
        System.out.printf("-".repeat(30) + "\n%s %s 캐릭터가 공격하였습니다. \n", callFrom, actionFrom.getName());
        double demage = actionTo.getHp() - actionFrom.getAd() / actionTo.getDef();
        if(demage < 0.0){
            demage  = 0.0;
        }
        actionTo.setHp(demage);
        System.out.printf("-> %s캐릭터의 체력이 %.1f로 떨어졌습니다.\n", actionTo.getName(), actionTo.getHp());
    }
    @Override
    protected synchronized void runAction() {
        try {
            while (actionFrom.getHp() > 0 && actionTo.getHp() > 0) {
                calculateHp("[" + threadName + "]", actionFrom, actionTo);
                Thread.sleep(100);
            }

        if (actionTo.getHp() == 0) {
            Thread.sleep(1000);
            System.out.println("-".repeat(30));
            System.out.printf("[%s] %s 캐릭터가 제거되었습니다. \n\n\n", threadName, actionTo.getName());
            System.out.println("-=".repeat(30));
            System.out.println(" ".repeat(26) + "승리!!");
            System.out.printf(" ".repeat(15) + "%s 캐릭터가 승리하였습니다.\n", actionFrom.getName());
            System.out.println("-=".repeat(30));
        }
        } catch (InterruptedException e) {
            System.out.println("Thread " + threadName + " interrupted.");
        }

    }
}
