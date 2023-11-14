package com.kaio.models.contas;

import com.kaio.contracts.ContaContract;
import com.kaio.models.Cliente;

import lombok.Getter;
@Getter
public abstract class Conta implements ContaContract {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = Conta.SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void depositar(double valor) {
        if(valor > 0 ){
            this.saldo += valor;
        }
    }
    
    @Override
    public double sacar(double valor) {
        if(valor > 0 && this.saldo >= valor){
            this.saldo -= valor;
            return valor;
        }
        return 0;
    }

    @Override
    public void transferir(Conta contaDestino, double valor) {
        contaDestino.depositar(this.sacar(valor));
    }

    protected String imprimirInfosComuns() {
        return "Titular: " + this.cliente.getNome() + "\n" +
               "Agencia: " + this.agencia +  "\n" +
               "Numero: " + this.numero +
               "Saldo: " + this.saldo ;
    }
}