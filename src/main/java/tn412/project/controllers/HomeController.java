package tn412.project.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {
    @GetMapping()
    public String getLogin() {
        return "/index";
    }

    @GetMapping("/account")
    public String getAccount() {
        return "/account";
    }



}
