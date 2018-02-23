package com.spring.controller;

import com.spring.services.AddPairToMap;

import com.spring.services.DeleteMarked;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import java.util.*;

@Controller
public class TodoController {
    Map map1 = new LinkedHashMap<>();
    AddPairToMap AddPairToMap1 = new AddPairToMap();
    DeleteMarked DeleteMarked1 = new DeleteMarked();
    @GetMapping("/")
    public ModelAndView showTodoApp() {
        ModelAndView model = new ModelAndView("TodoList");
        return model;
    }

    @PostMapping("/submit")
    public ModelAndView showTodoList(@ModelAttribute("todoItems1") TodoItems todoItems1) {
        ModelAndView model1 = new ModelAndView("TodoList");

        List checkedItems = todoItems1.getCheckedItems(); //gets the id of checked items

////the following code gets a unique, random id for every newly added list item, and adds id-value pair to 'map1'
        map1 = AddPairToMap1.addtomap(todoItems1, map1);

//the following code is responsible for deleting the items that were marked
        map1 = DeleteMarked1.deleteItems(todoItems1, map1, checkedItems);

        model1.addObject("checkedItems", checkedItems);
        model1.addObject("map1", map1);
        return model1;
    }

}

