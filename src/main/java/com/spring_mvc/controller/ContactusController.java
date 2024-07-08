package com.spring_mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContactusController {
    @RequestMapping("/contactus")
    public String contactus(){
        System.out.println("Contactus Page called...");
        return "contactus";
    }
}
