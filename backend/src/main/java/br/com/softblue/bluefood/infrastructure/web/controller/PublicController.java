package br.com.softblue.bluefood.infrastructure.web.controller;

import br.com.softblue.bluefood.domain.Client;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/public")
public class PublicController {

    @GetMapping("/cliente/new")
    public String newClient(Model model){
        Client client = new Client();
        model.addAttribute("client", new Client());
        return "cliente-cadastro";
    }
}
