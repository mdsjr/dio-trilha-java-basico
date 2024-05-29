import java.util.Locale;
import java.util.Scanner;
import java.util.Random;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        Random random = new Random();

        //Exibir as mensagens para o usuário
        System.out.println("Bem vindo ao Banco Nosso Banco!");

        //Obter pela scanner os valores digitados no terminal
        System.out.println("Digite seu nome complete para abertura de conta: ");
        String nome = scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();

        int numeroConta = 100000 + random.nextInt(900000);

        double saldo = 237.48;

        //Exibir a mensagem final da conta criadajuca 
        System.out.println("Olá,"+nome+" obrigado por criar uma conta em nosso banco, sua agência é "+agencia+" conta "+numeroConta+" e seu saldo de "+ saldo +" já está disponível para saque");

    }
}
