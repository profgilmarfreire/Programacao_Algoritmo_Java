import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner inUser = new Scanner(System.in);

        System.out.println("""
                Seja bem vindo ao nosso banco de câmbio!

                Informe a cotação do dolar atual:
                """);
                double cotacao = inUser.nextDouble();
                System.out.println("Informe o valor que deseja realizar o câmbio:\n");
                double carteira = inUser.nextDouble();
                double valor_receber = (carteira/cotacao);

                System.out.printf("O valor a receber é: US$%.2f\n", valor_receber);
        inUser.close();
    }
}
