package com;

import com.LolCharacers;

import java.util.HashMap;

public class CharactersList {
    private HashMap<Integer, LolCharacers> map = new HashMap<Integer, LolCharacers>();
    public LolCharacers getCharacterById(int id) {
        return map.get(id);
    }
    public void loadCharacters() {
        map.put(1, new LolCharacers("이즈리얼", 200.0, 200.0, 700.0));
        map.put(2, new LolCharacers("카이사", 250.0, 300.0, 100.0));
        map.put(3, new LolCharacers("리신", 230.0, 120.0, 300.0));
        map.put(4, new LolCharacers("베인", 100.0, 100.0, 200.0));
        map.put(5, new LolCharacers("쓰레쉬", 150.0, 150.0, 300.0));
        map.put(6, new LolCharacers("자르반 4세", 120.0, 150.0, 1000.0));
    }
    public int getCharacterNumbers() {
        return map.size();
    }
}
