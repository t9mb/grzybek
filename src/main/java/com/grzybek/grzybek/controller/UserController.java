package com.grzybek.grzybek.controller;

import com.grzybek.grzybek.domain.User;
import com.grzybek.grzybek.dto.UserTO;
import com.grzybek.grzybek.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
@AllArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping
    public String getAllUser(Model model) {
        model.addAttribute("lista", userService.getListAllUser());
        return "pages/userlist";
    }

    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable int id) {
        userService.deleteUser(id);
        return "redirect:/user";
    }

    @GetMapping("/registration")
    public String prepareForm(UserTO userTO) {
        return "pages/registration";
    }

    @PostMapping("/registration")
    public String addUser(@ModelAttribute UserTO userTO) {
        userService.createUser(userTO);
        return "redirect:/login";
    }

    @GetMapping("/edit/{id}")
    public String editUser(@PathVariable Integer id, Model model) {
        model.addAttribute("user", userService.getUserById(id));
        return "pages/edituser";
    }

    @PostMapping("/edit/{id}")
    public String editUser(@PathVariable Integer id, @ModelAttribute User user) {
        user.setId(id);
        userService.updateUser(user);
        return "redirect:/user";
    }

    @GetMapping("/show/{id}")
    public String showUser(@PathVariable Integer id, Model model) {
        model.addAttribute("user", userService.getUserById(id));
        return "pages/user";
    }
}
