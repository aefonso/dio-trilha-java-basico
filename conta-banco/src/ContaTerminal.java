import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
            // Criando um objeto Scanner para receber entrada do usuário
            Scanner scanner = new Scanner(System.in);
        
            // Solicitando os dados ao usuário
            System.out.println("Por favor, digite o número da Conta:");
            int numero = scanner.nextInt();
            
            // Consumir a quebra de linha pendente
            scanner.nextLine();
            
            System.out.println("Por favor, digite o número da Agência:");
            String agencia = scanner.nextLine();
            
            System.out.println("Por favor, digite o seu Nome:");
            String nomeCliente = scanner.nextLine();
            
            System.out.println("Por favor, digite o saldo:");
            double saldo = scanner.nextDouble();
            
            // Fechando o Scanner
            scanner.close();
            
            // Exibindo a mensagem final com os dados do usuário
            System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, " +
                    "sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

    }
}
