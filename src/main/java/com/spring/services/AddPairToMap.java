package com.spring.services;

import com.spring.controller.TodoItems;

import java.util.List;
import java.util.Map;

/**
 * @author : Suraj Gautam
 *         <suraj.gautam@f1soft.com>
 */
public class AddPairToMap {
    public Map addtomap(TodoItems todoItems1, Map map1) {
        String listItem = todoItems1.getListItem(); //gets every new item

//the following code gets a unique, random id for every newly added list item. nd adds id-value to 'map1'
        if(listItem != ""){
            ReturnItemIdPair returnItemIdPair1 = new ReturnItemIdPair();
            Map map = returnItemIdPair1.getItemIdPair(listItem, map1);
            map1.putAll(map);
        }
        return map1;
    }
}
