import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner inUser = new Scanner(System.in);

        System.out.println("""
                Seja bem vindo ao nosso calendário semanal!
                
                Informe o dia da semana:

                1 - Domingo
                2 - Segunda
                3 - Terça
                4 - Quarta
                5 - Quinta
                6 - Sexta
                7 - Sabado

                """);

                int diaSemana = inUser.nextInt();

                switch(diaSemana){
                    case 1: {
                        System.out.printf("Você escolheu %d. O dia da semana é Domingo", diaSemana);
                    }
                    break;
                    case 2: {
                        System.out.printf("Você escolheu %d. O dia da semana é Segunda", diaSemana);
                    }
                    break;
                     case 3: {
                        System.out.printf("Você escolheu %d. O dia da semana é Terça\n", diaSemana);
                    }
                    break;
                    case 4: {
                        System.out.printf("Você escolheu %d. O dia da semana é Quarta\n", diaSemana);
                    }
                    break;
                    case 5: {
                        System.out.printf("Você escolheu %d. O dia da semana é Quinta\n", diaSemana);
                    }
                    break;
                    case 6: {
                        System.out.printf("Você escolheu %d. O dia da semana é Sexta\n", diaSemana);
                    }
                    break;
                     case 7: {
                        System.out.printf("Você escolheu %d. O dia da semana é Sabado\n", diaSemana);
                    }
                    break;
                    default:
                        {
                            System.out.println("Opção invalida\n");
                    }
            } 
            

        inUser.close();
    }
}
