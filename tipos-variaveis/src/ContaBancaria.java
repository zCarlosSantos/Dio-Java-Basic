import java.util.Scanner;

public class ContaBancaria {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int n;
        String agencia;
        String nomeCliente;
        float saldo;

        System.out.println("Digite o n da conta: ");
        n = sc.nextInt();
        System.out.println("Digite o numero da agencia: ");
        agencia = sc.next();
        System.out.println("Digite o nome do cliente: ");
        nomeCliente = sc.next();
        System.out.println("Digite o saldo: ");
        saldo = sc.nextFloat();

        System.out.println("Olá " +  nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

    }
}
