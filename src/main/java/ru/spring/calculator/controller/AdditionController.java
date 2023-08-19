package ru.spring.calculator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.spring.calculator.domain.Addition;

@Controller
@RequestMapping("/calculator")
public class AdditionController {

    @GetMapping("/index")
    public String viewForm(Model model) {
        model.addAttribute("Addition", new Addition());
        return "calculator/index";
    }

    @PostMapping("/calculate")
    public String addForm(@ModelAttribute Addition addition, BindingResult result, Model model) {
        model.addAttribute("addition", addition);
        return "calculator/calculate";
    }
}
