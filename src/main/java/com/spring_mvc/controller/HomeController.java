package com.spring_mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {
    @RequestMapping("/home")
    public String home(Model model){
        System.out.println("This is home url...");

        model.addAttribute("name","Rutvik Jasani");
        model.addAttribute("mobile","7984507354");

        List<String> friends = new ArrayList<String>();
        friends.add("Rutvik");
        friends.add("Smit");
        friends.add("Shivangi");
        friends.add("Mansi");
        friends.add("Rency");
        friends.add("Jalpa");
        friends.add("Sanket");
        friends.add("Neel");
        friends.add("Nikhil");
        friends.add("Pratik");
        friends.add("Meet");
        friends.add("Kevin");
        friends.add("Renish");

        model.addAttribute("f",friends);

        return "home";
    }

    @RequestMapping("/about")
    public String about(){
        System.out.println("About Page Called...");
        return "about";
    }

    @RequestMapping("/contactus")
    public String contactus(){
        System.out.println("Contactus Page called...");
        return "contactus";
    }

    @RequestMapping("/help")
    public ModelAndView help(){
        System.out.println("Help Page Called...");
//        Object Created
        ModelAndView modelAndView = new ModelAndView();

//        Add Data
        modelAndView.addObject("id",96);
        modelAndView.addObject("name","Rutvik Jasani");
        modelAndView.addObject("number","7984507354");

        modelAndView.setViewName("help");

        return modelAndView;
    }
}
