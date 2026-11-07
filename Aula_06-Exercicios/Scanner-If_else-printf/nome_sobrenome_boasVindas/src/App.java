import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner inUser = new Scanner(System.in);
        System.out.println("""
                Seja bem vindo ao nosso sistema de cadastro!

                Se apresente:

                Qual o seu primeiro nome?
                \n
                """);
                String nome = inUser.nextLine();
                System.out.println("Informe o seu sobrenome\n");
                String sobrenome = inUser.nextLine();
                System.out.printf("Olá %s %s, é um prazer te conhecer\n", nome, sobrenome);


        inUser.close();
    }
}
