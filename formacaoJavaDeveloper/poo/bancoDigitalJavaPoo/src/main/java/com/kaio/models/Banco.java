package com.kaio.models;

import java.util.ArrayList;
import java.util.List;

import com.kaio.models.contas.Conta;

import lombok.Getter;
import lombok.Setter;

public class Banco {
    @Getter @Setter
    private String nome;

    private List<Conta> contas = new ArrayList<>();

    public List<Conta> getContas() {
        return List.copyOf(contas);
    }
}
