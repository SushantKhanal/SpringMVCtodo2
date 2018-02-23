package com.spring.services;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author : Suraj Gautam
 *         <suraj.gautam@f1soft.com>
 */
public class ReturnItemIdPair {
    private String id;
    private String item;
    private Map<String,String> map = new LinkedHashMap<String,String>();  // ordered

    public Map getItemIdPair(String item, Map map1) {

        String elemId = this.getRandomNumber();
        this.item = item;

        if(map1.containsKey(elemId) || map1.isEmpty()) {
            elemId = this.getRandomNumber();
            if(map1.containsKey(elemId)) {
                elemId = this.getRandomNumber();
            }
        }
        this.id = elemId;
        map.put(this.id, this.item);
        return map;
    }
    private String getRandomNumber() {
        int id = this.generate();
        String elemId = Integer.toString(id);
        return elemId;
    }

    public int generate() {
        int random = (int )(Math.random() * 100 + 1);
        return random;
    }

}
