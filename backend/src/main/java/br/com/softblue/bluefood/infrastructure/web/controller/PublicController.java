package br.com.softblue.bluefood.infrastructure.web.controller;

import br.com.softblue.bluefood.domain.Client;
import br.com.softblue.bluefood.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(path = "/public")
public class PublicController {


    @Autowired
    private ClientService clientService;

    @GetMapping("/cliente/new")
    public String newClient(Model model){
        Client client = new Client();
        model.addAttribute("cliente", new Client());
        ControllerHelper.setEditMode(model, true);
        return "cliente-cadastro";
    }

    @PostMapping("/cliente/save")
    public String saveCliente(@ModelAttribute("cliente") Client client){
        clientService.SaveCliente(client);
        return "cliente-cadastro";
    }
}
