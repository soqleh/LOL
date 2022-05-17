import java.util.HashMap;

public class CharactersTable {
    private HashMap<Integer, Character> map = new HashMap<Integer, Character>();
    public Character getCharacterById(int id) {
        return map.get(id);
    }
    public void loadCharacters() {
        map.put(1, new Character("이즈리얼", 200, 200, 700));
        map.put(2, new Character("카이사", 250, 300, 100));
        map.put(3, new Character("리신", 230, 120, 300));
        map.put(4, new Character("베인", 100, 100, 200));
        map.put(5, new Character("쓰레쉬", 150, 150, 300));
        map.put(6, new Character("자르반 4세", 120, 150, 1000));
    }
    public int getCharacterNumbers() {
        return map.size();
    }
}
