package contaBanco;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        String agencia, nomeCliente;
        long saldo;

        System.out.println("Por favor, digite o número da Conta!");
        numero = teclado.nextInt();
        teclado.nextLine();

        System.out.println("Por favor, digite o número da Agência!");
        agencia = teclado.nextLine();

        System.out.println("Por favor cliente, informe seu nome!");
        nomeCliente = teclado.nextLine();

        System.out.println("Por favor " + nomeCliente +", informe seu saldo!");
        saldo = teclado.nextLong();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível!");
    }
}
