package com.spring.controller;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class TodoItems {

    private String listItem; //latest added todo item

    private List checkedItems; //the list of ids of todo items that are marked

    private String submitted; //the value of either the submit or the delete button depending on what's clicked

    //getter and setter methods for listItem
    public String getListItem() {
        return listItem;
    }

    public void setListItem(String listItem) {
        this.listItem = listItem;
    }

    //getter and setter methods for checkedItems
    public List getCheckedItems() {
        if (null == checkedItems || checkedItems.isEmpty()) {
            return new LinkedList();
        }
        return checkedItems;
    }

    public void setCheckedItems(List checkedItems) {
        this.checkedItems = checkedItems;
    }

    //getter and setter methods for 'submitted'

    public String getSubmitted() {
        return submitted;
    }

    public void setSubmitted(String submitted) {
        this.submitted = submitted;
    }

}
