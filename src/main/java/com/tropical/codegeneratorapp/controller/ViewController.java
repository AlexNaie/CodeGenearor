package com.tropical.codegeneratorapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
public class ViewController {

    @RequestMapping(value = "/")
    public String index(Model model) {
        model.addAttribute("data", new Date());
        return "index";
    }

    @RequestMapping(value = "/code")
    public String code(Model model) {
        model.addAttribute("data", new Date());
        return "code";
    }

    @RequestMapping(value = "/findusedcodes")
    public String findusedcodes(Model model) {
        model.addAttribute("data", new Date());
        return "findusedcodes";
    }

    @RequestMapping(value = "/addcode")
    public String addcode(Model model) {
        model.addAttribute("data", new Date());
        return "addcode";
    }

    @RequestMapping(value = "/addwinningcode")
    public String addwinningcode(Model model) {
        model.addAttribute("data", new Date());
        return "addwinningcode";
    }

    @RequestMapping(value = "/redeemcode")
    public String redeemcode(Model model) {
        model.addAttribute("data", new Date());
        return "redeemcode";
    }

}
