
/**
 * <h1>Prática curso java</h1>
 * Exibir informações inseridas pelo usuário.
 * <p>
 * <b>Note:</b> Leia atentamente a documentação desta classes
 * para desfrutar dos recursos oferecidos pelo autor
 *
 * @author Cairo Ribeiro
 * @version 1.0
 * @since 12/10/2023
 */


import java.util.Locale;
import java.util.Scanner;

public class ContaBancaria {
  /**
     * Este método é utilizado para registrar as informações do usuário
     * 
     * @param conta  registra o número da conta inserida pelo usuário
     * @param agencia registra o número da agência inserida pelo usuário
     * @param nomeCliente registra o nome do cliente inserido pelo usuário
     * @param saldo registra o saldo inserido pelo usuário
     */
    public static void main(String[] args) {
       
        int conta = 0;
        String agencia = "";
        String nomeCliente = "";
        Double saldo=0.0;

        Scanner scanner  = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite seu nome");
        nomeCliente = scanner.next();
        System.out.println("Digite seu agencia");
        agencia = scanner.next();
        System.out.println("Digite sua conta");
        conta = scanner.nextInt();
        System.out.println("Digite seu saldo");
        saldo = scanner.nextDouble();

        System.out.println("nome do cliente: "+nomeCliente);
        System.out.println("numero da agencia: "+agencia);
        System.out.println("numero da conta: "+conta);
        System.out.println("saldo informado: "+saldo);

 
    }
}
