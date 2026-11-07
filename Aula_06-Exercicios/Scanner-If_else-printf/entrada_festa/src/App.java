import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner inUser = new Scanner(System.in);
       System.out.println("""
               Seja bem vindo(a) a nossa casa de shows!
               
               Responda as perguntas abaixo antes de continuar
               """);
               System.out.println("informe a sua idade\n");
               int idade = inUser.nextInt();
               if(idade < 18){
                System.out.println("Você é menor de Idade e não poderá entrar na festa");
               }else{
                System.out.println("""
                            Voce tem o ingresso?
                            1 - sim
                            2 - não
                        """);
                int ingresso = inUser.nextInt();
                if(ingresso == 2){
                    System.out.println("Voce nao pode entrar");
                }else{
                    System.out.println("Seja bem vindo");
                }
               }


               inUser.close();
    }
}
