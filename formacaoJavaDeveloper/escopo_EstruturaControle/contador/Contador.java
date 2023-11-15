package contador;

import java.util.List;
import java.util.Scanner;

class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String mensagem) {
        super(mensagem);
    }
}

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        int parametroUm = terminal.nextInt();
        int parametroDois = terminal.nextInt();


        try{
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e){
            System.out.println(e.getMessage());
        }

        terminal.close();
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if(parametroUm > parametroDois){
            throw new ParametrosInvalidosException("O segundo parametro deve ser maior que o primeiro");
        }
        int contagem = parametroDois - parametroUm;
        for(int i = 1 ; i <= contagem; i++){
            System.out.println(i);
        }
    }
}