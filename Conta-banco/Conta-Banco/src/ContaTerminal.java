import java.util.Locale;
import java.util.Scanner;
public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        /*TODO: Conhecer e importar a classe Scanner*/
        //Exibir as mensagens oara o usuário.
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        //Obter pelo Scanner as mensagens no terminal
        System.out.println("Bem vindo!");
        System.out.println("Digite sua agência: ");
        String agencia = scanner.next();

        System.out.println("Número da sua conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Seu nome: ");
        String nome = scanner.next();

        System.out.println("Saldo: ");
        double saldo = scanner.nextDouble();

        //Exibir as mensagens criadas

        System.out.println("Nome: "+ nome);
        System.out.println("Agência: "+ agencia);
        System.out.println("Numero da conta: "+ numeroConta);
        System.out.println("Saldo em conta: "+ saldo+"R$");


    }
    
}
