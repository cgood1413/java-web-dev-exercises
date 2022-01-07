package org.launchcode.java.studios.charcount;

import java.util.HashMap;

public class CountChars {

    public static HashMap getChars(char[] charArr){
        HashMap<Character, Integer> map = new HashMap<>();

        for (char i : charArr){
            if (Character.isLetter(i)){
                int count = map.containsKey(i) ? map.get(i) : 0;
                map.put(i, count + 1);
            }
        }
        return map;
    };
}
