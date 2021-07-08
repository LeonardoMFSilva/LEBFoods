package br.com.softblue.bluefood.repository;

import br.com.softblue.bluefood.domain.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Integer> {


}
