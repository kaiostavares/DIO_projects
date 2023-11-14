package com.kaio.models.contas;

import com.kaio.models.Cliente;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(Cliente cliente){
        super(cliente);
    }

    @Override
    protected String imprimirInfosComuns() {
        return "=== Extrato Conta Poupança ===\n" + super.imprimirInfosComuns();
    }
}
