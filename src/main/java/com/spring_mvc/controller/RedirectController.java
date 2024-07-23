package com.spring_mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class RedirectController {
    @RequestMapping("/one")
    public String one(){
        System.out.println("one Called...");
//
        return "redirect:/enjoy";
    }
    @RequestMapping("/enjoy")
    public RedirectView second(){
        System.out.println("{enjoy} second Called...");
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl("contact");
        return redirectView;
    }
}
