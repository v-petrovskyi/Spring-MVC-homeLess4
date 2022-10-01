package com.homeTask.controllers;

import com.homeTask.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class Hello {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String helloIt() {
        return "index.jsp";
    }

    @GetMapping(value = "/bye")
    public String bye() {
        return "bye.jsp";
    }

//    @GetMapping(value = "/summary")
//    public String sum(){

//        return "summary.jsp";

//    }

    @GetMapping(value = "/pass-data")
    public String passDataFromUser() {
        return "pass-data.jsp";
    }

    @PostMapping(value = "/pass-data")
    public ModelAndView passDataFromUser(@ModelAttribute("user") User user, ModelAndView modelAndView) {
        modelAndView.setViewName("forward:/summary.jsp");
        modelAndView.addObject("user", user);
        return modelAndView;
    }

    @GetMapping(value = "/path/{userName}")
    public ModelAndView greeting(@PathVariable String userName, ModelAndView modelAndView) {
        modelAndView.setViewName("forward:/greeting.jsp");
        modelAndView.addObject("userName", userName);
        return modelAndView;
    }



}
