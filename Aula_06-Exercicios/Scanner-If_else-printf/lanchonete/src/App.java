import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner inUser = new Scanner(System.in);

       double refri = 7;
       double burguer = 18;

       System.out.println("Seja bem vindo a nossa lanchonete\n");
       System.out.println("Quantos hamburgues você deseja?\n");
       int qtd_burguer = inUser.nextInt();
       System.out.println("Quantos refrigerantes voceê deseja?");
       int qtd_refri = inUser.nextInt();

       System.out.printf("Você escolher %d burgues, %d refrigerantes.\n", qtd_burguer, qtd_refri);
       System.out.printf("O valor total de sua compra é: R$%.2f\n", ((qtd_burguer*burguer) + (qtd_refri*refri)));
        inUser.close();
    }
}
