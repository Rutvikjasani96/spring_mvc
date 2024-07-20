package com.spring_mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContactController {
    @RequestMapping("/contact")
    public String showForm() {
        return "contact";
    }

    @RequestMapping(path = "/processform", method = RequestMethod.POST)
    public String handleForm(@RequestParam("email") String email,
                             @RequestParam("userName") String userName,
                             @RequestParam("userPassword") String userPassword,
                             Model model) {
        model.addAttribute("email", email);
        model.addAttribute("userName", userName);
        model.addAttribute("userPassword", userPassword);

        return "success";
    }
}
