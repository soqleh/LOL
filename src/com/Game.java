package com;

import com.CharactersList;
import com.LolCharacers;
import com.skills.AttackThread;
import com.skills.DefenseThread;

import java.util.Scanner;

public class Game {
    CharactersList charactersList;
    int[] characterId = {-1, -1};
    public static final int MY = 0;
    public static final int OTHER = 1;

    public LolCharacers myCharactor;
    public LolCharacers otherCharactor;

    public synchronized LolCharacers getMyCharactor() {
        if (myCharactor == null && characterId[MY] > 0) {
            myCharactor = charactersList.getCharacterById(characterId[MY]);
        }
        return myCharactor;
    }

    public synchronized LolCharacers getOtherCharactor() {
        if (otherCharactor == null && characterId[OTHER] > 0) {
            otherCharactor = charactersList.getCharacterById(characterId[OTHER]);
        }
        return otherCharactor;
    }


    Game() {
        createCharacters();
        showCharacters();
        selectCharacter();
        showSelectedCharacters();
        fight();
    }

    //게임 캐릭터 데이터 생성
    void createCharacters() {
        charactersList = new CharactersList();
        charactersList.loadCharacters();
        System.out.println("NUMBER:" + charactersList.getCharacterNumbers());
    }

    //게임 캐릭터 선택
    public void selectCharacter() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println(" 나의 게임 캐릭터를 선택해 주세요. (번호 입력): ");
            int my = sc.nextInt();
            System.out.println(" 상대의 게임 캐릭터를 선택해 주세요. (번호 입력): ");
            int other = sc.nextInt();
            sc.close();
            characterId[MY] = my;
            characterId[OTHER] = other;
            //TODO: 입력 예외 처리 추가 필요

        } catch (Exception e) {
            System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
        }
    }

    //게임 캐릭터 출력창
    private void showCharacters() {
        if (charactersList == null) {
            System.out.println("LOADING DATA - FAILED");
            return;
        }
        System.out.print("게임 참여를 환영합니다.\n");
        System.out.println("-".repeat(50));
        for (int i = 1; i <= charactersList.getCharacterNumbers(); i++) {
            LolCharacers c = charactersList.getCharacterById(i);
            System.out.printf("(%d) 이름: %s, 공격력: %s, 방어력: %s, 체력: %s\n", i + 1, c.getName(), c.getAd(), c.getDef(), c.getHp());
        }
        System.out.println("-".repeat(50));
    }

    //게임 캐릭터 안내
    private void showSelectedCharacters() {
        if (getMyCharactor() == null || getOtherCharactor() == null)
            return;

        System.out.printf("게임을 시작합니다. %s vs %s\n\n", getMyCharactor().getName(), getOtherCharactor().getName());
        System.out.println("-".repeat(50));
    }


    public void fight() {
        if (getMyCharactor() == null || getOtherCharactor() == null)
            return;

        AttackThread tMyAttack = new AttackThread("MyAttack", getMyCharactor(), getOtherCharactor());
        tMyAttack.start();
        AttackThread tOtherAttack = new AttackThread( "OthersAttack", getOtherCharactor(), getMyCharactor());
        tOtherAttack.start();
        DefenseThread tMyDefense = new DefenseThread("MyDefense", getMyCharactor(), getOtherCharactor());
        tMyDefense.start();
        DefenseThread tOtherDefense = new DefenseThread( "OtherDefense", getOtherCharactor(), getMyCharactor());
        tOtherDefense.start();
    }

}
