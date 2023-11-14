package com.kaio.contracts;

import com.kaio.models.contas.Conta;

public interface ContaContract {
    double sacar(double valor);
    void depositar(double valor);
    void transferir(Conta contaDestino, double valor);
}
