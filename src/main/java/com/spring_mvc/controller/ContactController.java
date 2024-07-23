package com.spring_mvc.controller;

import com.spring_mvc.model.User;
import com.spring_mvc.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContactController {

    private UserService userService;
    @ModelAttribute
    public void CommonDataForModel(Model model) {
        model.addAttribute("head","Welcome to Spring MVC");
        model.addAttribute("desc", "Spring MVC");
    }
    @RequestMapping("/contact")
    public String showForm(Model model) {
        return "contact";
    }

    @RequestMapping(path = "/processform", method = RequestMethod.POST)
    public String handleForm(@ModelAttribute User user, Model model) {
        userService.createUser(user);
        return "success";
    }
}

//@RequestMapping(path = "/processform", method = RequestMethod.POST)
//public String handleForm(@RequestParam("email") String email,
//                         @RequestParam("userName") String userName,
//                         @RequestParam("userPassword") String userPassword,
//                         Model model) {
////        model.addAttribute("email", email);
////        model.addAttribute("userName", userName);
////        model.addAttribute("userPassword", userPassword);
//
//    User user = new User();
//    user.setEmail(email);
//    user.setUserName(userName);
//    user.setUserPassword(userPassword);
//    model.addAttribute("user", user);
//
//    return "success";
//}

