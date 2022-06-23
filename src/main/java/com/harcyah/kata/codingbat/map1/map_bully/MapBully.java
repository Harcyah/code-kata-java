package com.harcyah.kata.codingbat.map1.map_bully;

import java.util.Map;

public class MapBully {

    public Map<String, String> mapBully(Map<String, String> map) {
        String a = map.get("a");
        if (a != null) {
            map.put("a", "");
            map.put("b", a);
        }
        return map;
    }

}
