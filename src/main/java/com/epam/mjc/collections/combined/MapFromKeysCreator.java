package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> map = new HashMap<>();
        for (String s : sourceMap.keySet()) {
            if (!map.containsKey(s.length())){
                Set<String> temp = new HashSet<>();
                temp.add(s);
                map.put(s.length(),temp);
            }else {
                map.get(s.length()).add(s);
                map.put(s.length(), map.get(s.length()));
            }
        }

        return map;
    }
}
