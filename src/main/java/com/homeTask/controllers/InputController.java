package com.homeTask.controllers;

import com.homeTask.entity.SomeText;
import com.homeTask.writerReader.WriterReader;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

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

    @RequestMapping(value = ("/record"))
    public String showTotalRecords(HttpServletRequest request, Model model){
        String record = request.getParameter("someText");
        SomeText someText = new SomeText(record);
        WriterReader.writeFile(record);
        model.addAttribute("count", SomeText.count);
        model.addAttribute("someText", someText.getText());
        return "records-view";
    }
}
