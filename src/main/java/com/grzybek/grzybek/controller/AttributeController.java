package com.grzybek.grzybek.controller;


import com.grzybek.grzybek.domain.Attribute;
import com.grzybek.grzybek.dto.AttributeTO;
import com.grzybek.grzybek.services.AttributeService;
import lombok.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("/attribute")
@AllArgsConstructor
public class AttributeController {

    private final AttributeService attributeService;

    @GetMapping
    public String getAllAttributes(Model model) {
        model.addAttribute("attributeList", attributeService.getListAllAttributes());
        return "pages/attributelist";
    }

    @GetMapping("/delete/{id}")
    public String deleteAttribute(@PathVariable int id) {
        attributeService.deleteAttribute(id);
        return "redirect:/attribute";
    }

    @GetMapping("/create")
    public String prepareForm(AttributeTO attributeTO) {
        return "pages/addattribute";
    }

    @PostMapping("/create")
    public String addAttribute(@ModelAttribute @Valid AttributeTO attributeTO, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "pages/addattribute";
        }
        attributeService.createAttribute(attributeTO);
        return "redirect:/attribute";
    }

    @GetMapping("/edit/{id}")
    public String editAttribute(@PathVariable Integer id, Model model) {
        model.addAttribute("attribute", attributeService.getAttributeById(id));
        return "pages/editattribute";
    }

    @PostMapping("/edit/{id}")
    public String editAttribute(@PathVariable Integer id, @ModelAttribute Attribute attribute) {
        attribute.setId(id);
        attributeService.updateAttribute(attribute);
        return "redirect:/attribute";
    }
}
