package com.grzybek.grzybek.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ciekawostki")
@AllArgsConstructor
public class CiekawostkiController {
    @GetMapping
    public String WyswietlGry()
    {
        return "pages/ciekawostki";
    }

}
