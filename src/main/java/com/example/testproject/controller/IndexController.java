package com.example.testproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.example.testproject.dto.ContentsForm;
import com.example.testproject.service.TestService;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class IndexController {
    
    @Autowired
    private TestService testService;

    @GetMapping("/")
    public String index(@ModelAttribute ContentsForm contentsForm, Model model) {
            model.addAttribute("testList", testService.getAll()); 
        return "index";
    }

    @PostMapping("/add-contents")
    public String addContents(@ModelAttribute ContentsForm contentsForm, Model model) {
        testService.addContents(contentsForm);
        return "redirect:/";
    }
    
}
