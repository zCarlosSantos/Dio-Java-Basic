import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int n;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Digite o numero da conta: ");
        n = sc.nextInt();
        System.out.println("Digite o numero da agencia: ");
        agencia = sc.next();
        System.out.println("Digite o nome do cliente: ");
        nomeCliente = sc.next();
        System.out.println("Digite o saldo: ");
        saldo = sc.nextFloat();

        System.out.println("Olá " +  nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + n + " e seu saldo R$" + saldo + " já está disponível para saque.");
        sc.close();
    }
}