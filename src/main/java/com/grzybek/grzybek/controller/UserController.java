package com.grzybek.grzybek.controller;

import com.grzybek.grzybek.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/User")
@AllArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping
    public String getAllUser(Model model) {
        model.addAttribute("lista", userService.getListAllUser());
        return "pages/userlist";
    }

}
