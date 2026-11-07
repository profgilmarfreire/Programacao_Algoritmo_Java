import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner inUser = new Scanner(System.in);

        System.out.println("""
                Seja bem vindo ao nosso calendário semanal!
                
                Informe o dia da semana:

                500 - Domingo
                2 - Segunda
                3 - Terça
                4 - Quarta
                5 - Quinta
                6 - Sexta
                7 - Sabado

                """);

                int diaSemana = inUser.nextInt();

                switch(diaSemana){
                    case 500 -> System.out.printf("Você escolheu %d. O dia da semana é Domingo", diaSemana);                  
                    case 2 -> System.out.printf("Você escolheu %d. O dia da semana é Segunda", diaSemana);
                    case 3 -> System.out.printf("Você escolheu %d. O dia da semana é Terça\n", diaSemana);
                    case 4 -> System.out.printf("Você escolheu %d. O dia da semana é Quarta\n", diaSemana);
                    case 5 -> System.out.printf("Você escolheu %d. O dia da semana é Quinta\n", diaSemana);
                    case 6 -> System.out.printf("Você escolheu %d. O dia da semana é Sexta\n", diaSemana);
                    case 7 -> System.out.printf("Você escolheu %d. O dia da semana é Sabado\n", diaSemana);
                    default -> System.out.println("Opção invalida\n");
                    
            } 
         inUser.close();
    }
}
