package com.msclient.msclient.dto;

import com.msclient.msclient.entities.Client;
import jakarta.validation.constraints.*;

import java.time.LocalDate;

public class ClientDTO {

    private Long id;

    @Size(min = 3, max = 100, message = "Nome deve ter de 3 a 100 caracteres.")
    @NotBlank(message = "Campo obrigatório")
    private String name;

    @Size(min = 11, max = 11, message = "CPF deve ter 11 caracteres.")
    @NotBlank(message = "Campo obrigatório")
    private String cpf;

    @Positive(message = "A renda deve ser positivo.")
    private Double income;

    @PastOrPresent(message = "Data de nascimento não pode ser data futura.")
    @NotNull(message = "Campo obrigatório.")
    private LocalDate birthDate;

    @Positive(message = "Números de filhos deve ser positivo.")
    @NotNull(message = "Campo obrigatório.")
    private Integer children;

    public ClientDTO() {
    }

    public ClientDTO(Long id, String name, String cpf, Double income, LocalDate birthDate, Integer children) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.income = income;
        this.birthDate = birthDate;
        this.children = children;
    }

    public ClientDTO(Client client) {
        id = client.getId();
        name = client.getName();
        cpf = client.getCpf();
        income = client.getIncome();
        birthDate = client.getBirthDate();
        children = client.getChildren();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public Double getIncome() {
        return income;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Integer getChildren() {
        return children;
    }
}
