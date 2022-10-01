package com.homeTask.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InputController {
    @GetMapping(value = "/")
    public String showMainPage(){
        return "main_page.jsp";
    }

    @RequestMapping(value = ("total-records"))
    public String showTotalRecords(){
        return "total-records.jsp";
    }
}
