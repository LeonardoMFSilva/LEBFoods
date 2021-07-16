package br.com.softblue.bluefood.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@MappedSuperclass
public class User implements Serializable {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank(message = "Nome não pode ser vazio!")
    @Size(max = 80, message = "Nome muito grande")
    private String nome;

    @NotBlank(message = "E-mail não pode ser vazio!")
    @Size(max = 60, message = "O e-mail informado é muito grande!")
    @Email(message = "E-mail inválido!")
    private String email;

    @NotBlank(message = "Senha não pode ser vazia!")
    @Size(max = 80, message = "Senha muito longa!")
    private String senha;

    @NotBlank(message = "Telefone não pode ser vazio!")
    @Pattern(regexp = "[0-9] {10,11}", message = "Telefone inválido!")
    @Column(length = 11, nullable = false)
    private String telefone;
}
