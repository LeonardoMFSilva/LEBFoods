package br.com.softblue.bluefood.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@MappedSuperclass
public class User implements Serializable {

    @EqualsAndHashCode.Include
    @Id
    private Integer id;
    private String nome;
    private String email;
    private String senha;
    private String telefone;
}
