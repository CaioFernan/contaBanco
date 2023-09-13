import java.util.Locale;
import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) throws Exception {
        try (Scanner scan = new Scanner(System.in).useLocale(Locale.US)) {
            double saldo = 380.67;

            System.out.println("Olá informe seu nome. ");
            String nome = scan.next();

            System.out.println("oi " + nome + " agora informe o numero da conta");
            int conta = scan.nextInt();

            System.out.println(nome + " agora informe o numero da agencia");
            int agencia = scan.nextInt();

            System.out.println("Olá " + nome + ", obrigado por criar uma conta no nosso banco, sua agência é " + agencia + " sua conta é " + conta + " com saldo de " + saldo + " já está disponivel para saque");
        }
    }
}
