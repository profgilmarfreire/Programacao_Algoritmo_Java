import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner inUser = new Scanner(System.in);
        System.out.println("""
                Seja bem vindo ao sistema da nossa empresa!

                Informe as seguintes solicitações:

                Qual o seu primeiro nome?                
                """);
                String nome = inUser.nextLine();
                System.out.println("Informe o seu sobrenome\n");
                String sobrenome = inUser.nextLine();
                
                System.out.println("Qual o seu salário atual? \n");
                double salario = inUser.nextDouble();

                inUser.nextLine();

                System.out.println("Qual é o mês vigente? \n");
                String mes = inUser.nextLine();

                System.out.printf("""
                        Olá %s %s, é um prazer te conhecer!
                        O funcionário %s %s teve um salário de R$%.2f no mes de %s.  
                        """,nome, sobrenome, nome, sobrenome, salario, mes);


        inUser.close();
    }
}
