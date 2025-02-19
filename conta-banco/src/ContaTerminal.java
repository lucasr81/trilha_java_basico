import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor digite o número da sua agencia: ");
        int numeroConta = scanner.nextInt();
        System.out.println("você digitou " +numeroConta);

        System.out.println("Digite sua agencia: ");
        String agencia = scanner.next();
        System.out.println("Você digitou a sua agencia "+agencia);

        System.out.println("Digite seu nome: ");
        String nomeCliente = scanner.next();
        System.out.println("Olá "+nomeCliente);

        System.out.println("Digite o valor do seu saldo: ");
        float saldoCliente = scanner.nextFloat();
        System.out.println("O seu saldo é " + saldoCliente);

        System.out.println("Olá Sr "+nomeCliente);
        System.out.println("Numero da conta "+numeroConta);
        System.out.println("Agencia" + agencia);
        System.out.println("O seu saldo é de " +saldoCliente);


        
        
    }
}
