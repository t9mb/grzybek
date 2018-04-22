package com.grzybek.grzybek.controller;

import com.grzybek.grzybek.domain.Grzyb;
import com.grzybek.grzybek.dto.GrzybTO;
import com.grzybek.grzybek.services.AttributeService;
import com.grzybek.grzybek.services.GrzybService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("/grzyb")
@AllArgsConstructor
public class GrzybController {

    private final GrzybService grzybService;

    private final AttributeService attributeService;

    @GetMapping
    public String getAllGrzyb(Model model) {
        model.addAttribute("grzybList", grzybService.getListAllGrzyb());
        return "pages/grzyby";
    }

    @GetMapping("/delete/{id}")
    public String deleteGrzyb(@PathVariable int id) {
        grzybService.deleteGrzyb(id);
        return "redirect:/grzyb";
    }

    @GetMapping("/create")
    public String prepareForm(GrzybTO grzybTO, Model model) {
        model.addAttribute("attributeList", attributeService.getListAllAttributes());
        return "pages/addgrzyb";
    }

    @PostMapping("/create")
    public String addGrzyb(@ModelAttribute @Valid GrzybTO grzybTO, BindingResult bindingResult, Model model) {
        if(bindingResult.hasErrors()) {
            model.addAttribute("attributeList", attributeService.getListAllAttributes());
            return "pages/addgrzyb";
        }
        grzybService.createGrzyb(grzybTO);
        return "redirect:/grzyb";
    }

    @GetMapping("/edit/{id}")
    public String editGrzyb(@PathVariable Integer id, Model model) {
        model.addAttribute("grzyb", grzybService.getGrzybById(id));
        return "pages/editgrzyb";
    }

    @PostMapping("/edit/{id}")
    public String editGrzyb(@PathVariable Integer id, @ModelAttribute Grzyb grzyb) {
        grzyb.setId(id);
        grzybService.updateGrzyb(grzyb);
        return "redirect:/grzyb";
    }

    @GetMapping("/show/{id}")
    public String showGrzyb(@PathVariable Integer id, Model model) {
        model.addAttribute("grzyb", grzybService.getGrzybById(id));
        return "pages/grzyb";
    }
}
