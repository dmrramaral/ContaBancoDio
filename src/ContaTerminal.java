import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
    
        Scanner scanner =  new Scanner(System.in);

        Conta user = new Conta();

        System.out.println("Olá, seja bem vindo ao Banco !");
        System.out.println("Qual é o seu nome?");
        user.setNameClient(scanner.nextLine());

        System.err.println("Qual é o numero da Agencia");
        user.setAgencia(scanner.nextInt());
        
        System.err.println("Qual é o numero da Conta");
        user.setNumber(scanner.nextInt());

        System.out.println("Insira o Saldo na sua conta");
        user.setSaldo(scanner.nextDouble());


        System.out.println("Olá "+ user.getNameClient()+
        ", obrigado por criar uma conta em nosso banco, sua agência é "+user.getAgencia()
        +", conta "+user.getNumber()+" e seu saldo "+user.getSaldo()+" já está disponível para saque");


        scanner.close();


    
    
    
    
    }

}
