package br.com.softblue.bluefood.infrastructure.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class LoginController {

    @GetMapping(path = {"/login", "/"})
    public String login(){
        return "login";
    }
}
