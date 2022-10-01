package com.homeTask.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InputController {
    @RequestMapping(value = "/")
    public String showMainPage(){
        return "main-page-view";
    }

    @RequestMapping(value = "/add-record")
    public String addRecord(){
        return "add-record-view";
    }

    @RequestMapping(value = ("/totalRecords"))
    public String showTotalRecords(){
        return "total-records-view";
    }
}
