package br.com.softblue.bluefood.services;

import br.com.softblue.bluefood.domain.Client;
import br.com.softblue.bluefood.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public void SaveCliente(Client client){
        clientRepository.save(client);
    }
}
