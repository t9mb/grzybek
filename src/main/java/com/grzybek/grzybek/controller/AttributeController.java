package com.grzybek.grzybek.controller;


import com.grzybek.grzybek.services.AttributeService;
import lombok.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/attribute")
@AllArgsConstructor
public class AttributeController {

    private final AttributeService attributeService;

    @GetMapping
    public String getAllUser(Model model) {
        model.addAttribute("attributelist", attributeService.getListAllAttributes());
        return "pages/attributelist";
    }

    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable int id) {
        userService.deleteUser(id);
        return "redirect:/user";
    }


}
