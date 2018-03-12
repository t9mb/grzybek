package com.grzybek.grzybek.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping
    public String getHome(Model model){
        model.addAttribute("nameapp", "grzybek");
        model.addAttribute("deskriptionapp", "Aplikacja, która umożliwia lokalizowanie w polskich lasach miejsc występowania grzybów ");
        return "pages/index";
    }

    @GetMapping("/errors")
    public String error(){
        return "pages/error";
        }
    }

