package com.grzybek.grzybek.controller;

import com.grzybek.grzybek.domain.Localization;
import com.grzybek.grzybek.dto.LocalizationTO;
import com.grzybek.grzybek.services.GrzybService;
import com.grzybek.grzybek.services.LocalizationService;
import lombok.AllArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("/localization")
@AllArgsConstructor
public class LocalizationController {

    private final LocalizationService localizationService;

    private final GrzybService grzybService;

    @GetMapping
    public String getAllLocalizations(Model model) {
        model.addAttribute("localizationList", localizationService.getListAllLocalization());
        return "pages/localizations";
    }

    @GetMapping("/delete/{id}")
    public String deleteLocalization(@PathVariable int id) {
        localizationService.deleteLocalization(id);
        return "redirect:/localization";
    }

    @GetMapping("/create")
    public String prepareForm(LocalizationTO localizationTO, Model model) {
        model.addAttribute("grzyblist", grzybService.getListAllGrzyb());
        return "pages/addlocalization";
    }

    @PostMapping("/create")
    public String addLocalization(@ModelAttribute @Valid LocalizationTO localizationTO, BindingResult bindingResult) {
        if(bindingResult.hasErrors()) {
            return "pages/addlocalization";
        }
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String name = authentication.getName();
        localizationService.createLocalization(localizationTO, name);
        return "redirect:/localization";
    }

    @GetMapping("/edit/{id}")
    public String editLocalization(@PathVariable Integer id, Model model) {
        model.addAttribute("localization", localizationService.getLocalizationById(id));
        return "pages/editlocalization";
    }

    @PostMapping("/edit/{id}")
    public String editLocalization(@PathVariable Integer id, @ModelAttribute Localization localization) {
        localization.setId(id);
        localizationService.updateLocalization(localization);
        return "redirect:/localization";
    }

    @GetMapping("/show/{id}")
    public String showUser(@PathVariable Integer id, Model model) {
        model.addAttribute("localization", localizationService.getLocalizationById(id));
        return "pages/localization";
    }
}