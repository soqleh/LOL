import java.util.Scanner;

public class Game {
    CharactersTable characters;
    int[] characterId = {-1, -1};
    public static final int MY = 0;
    public static final int OTHER = 1;


    Game() {
        createCharacters();
        showCharacters();
        selectCharacter();
        showSelectedCharacters();
        fight();
    }

    //게임 캐릭터 데이터 생성
    void createCharacters() {
        characters = new CharactersTable();
        characters.loadCharacters();
        System.out.println("NUMBER:" + characters.getCharacterNumbers());
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
            System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.2");
        }

//        }
    }

    //게임 캐릭터 출력창
    private void showCharacters() {
        if (characters == null) {
            System.out.println("LOADING DATA - FAILED");
            return;
        }
        System.out.print("게임 참여를 환영합니다.\n");
        System.out.println("-".repeat(50));
        for (int i = 1; i <= characters.getCharacterNumbers(); i++) {
            Character c = characters.getCharacterById(i);
            System.out.printf("(%d) 이름: %s, 공격력: %s, 방어력: %s, 체력: %s\n", i + 1, c.getName(), c.getAd(), c.getDef(), c.getHp());
        }
        System.out.println("-".repeat(50));
    }

    //게임 캐릭터 안내
    private void showSelectedCharacters() {
        Character my = characters.getCharacterById(characterId[MY]);
        Character other = characters.getCharacterById(characterId[OTHER]);
        System.out.printf("게임을 시작합니다. %s vs %s\n\n", my.getName(), other.getName());
        System.out.println("-".repeat(50));
    }
    private synchronized void calculateHp(String callFrom, Character attackFrom, Character attackTo){
        System.out.printf("%s %s 캐릭터가 공격하였습니다. \n", callFrom, attackFrom.getName());
        int nowHp = Math.max(attackTo.getHp() - attackFrom.getAd()/attackTo.getDef(), 0);
        attackTo.setHp(nowHp);
        System.out.println("attackTo.getHp():" + attackTo.getHp() + ", attackFrom.getAd(): " + attackFrom.getAd()
        + ", attackTo.getDef(): " + attackTo.getDef());
        System.out.printf("%s %s 캐릭터의 남은 체력은 %d 입니다.. \n\n", callFrom, attackTo.getName(), attackTo.getHp());
    }
    //play
    private synchronized void attack(Character attackFrom, Character attackTo) {
        while(attackFrom.getHp() > 0 && attackTo.getHp()>0) {
            calculateHp("[T]", attackFrom,attackTo);
        }
        System.out.printf("[T]%s 캐릭터가 제거되었습니다. \n\n", attackTo.getName());
    }
    public void fight(){
        Thread my = new AttackThread();
        my.start();
        Thread other = new AttackThread();
        other.start();
    }
    class AttackThread extends Thread {
        Character my = characters.getCharacterById(characterId[MY]);
        Character other = characters.getCharacterById(characterId[OTHER]);
        public void run() {
            attack(other, my);
        }
    }
    //게임 결과 출력
}
