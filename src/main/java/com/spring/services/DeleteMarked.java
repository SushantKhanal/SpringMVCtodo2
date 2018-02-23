package com.spring.services;

import com.spring.controller.TodoItems;

import java.util.List;
import java.util.Map;

/**
 * @author : Suraj Gautam
 *         <suraj.gautam@f1soft.com>
 */
public class DeleteMarked {
    public Map deleteItems(TodoItems todoItems1, Map map1, List checkedItems) {
        String check = "delete";

        String submitted = todoItems1.getSubmitted(); //gets the string value of 'delete' or 'Submit'

        if (submitted.equals(check)) {
            if (checkedItems != null && !checkedItems.isEmpty()) {
                for (Object key : checkedItems) {
                    if (map1.containsKey(key)) {
                        //Object tobeDeleted = map1.get(key);
                        map1.remove(key);
                    }
                }

            }
        }

        return map1;
    }
}
