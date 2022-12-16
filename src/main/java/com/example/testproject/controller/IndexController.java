package com.example.testproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.testproject.service.TestService;

@Controller
public class IndexController {
    
    @Autowired
    private TestService testService;

    @RequestMapping("/")
    public String index(Model model) {
            model.addAttribute("testList", testService.getAll()); 
        return "index";
    }
}
