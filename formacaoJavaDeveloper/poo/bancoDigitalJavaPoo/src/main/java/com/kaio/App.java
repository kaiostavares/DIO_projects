package com.kaio;

import com.kaio.models.Banco;
import com.kaio.models.Cliente;
import com.kaio.models.contas.Conta;
import com.kaio.models.contas.ContaCorrente;

public class App 
{
    public static void main( String[] args )
    {
        Conta cc1 = new ContaCorrente(new Cliente());
        System.out.println(cc1.getAgencia());

        Banco b1 = new Banco();

        b1.getContas().add(cc1);
        System.out.println(b1.getContas());
    }
}
