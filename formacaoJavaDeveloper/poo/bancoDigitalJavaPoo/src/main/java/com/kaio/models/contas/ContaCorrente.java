package com.kaio.models.contas;

import com.kaio.models.Cliente;

public class ContaCorrente extends Conta {
    public ContaCorrente(Cliente cliente){
        super(cliente);
    }

    @Override
    protected String imprimirInfosComuns() {
        return "=== Extrato Conta Corrente ===\n" + super.imprimirInfosComuns();
    }
}
