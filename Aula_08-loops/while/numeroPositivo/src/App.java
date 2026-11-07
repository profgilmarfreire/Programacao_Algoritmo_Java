import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        int num = 1;
        int soma = 0;
         while (num != 0) {
            System.out.println("""
                    Digite qualquer numero positivo ou
                    Digite zero (0) para sair
                    """);
                    num = entrada.nextInt();
                    
                    soma = soma + num;
                    
                    System.out.printf("""
                        Você digitou %d.
                        A soma de todas as tentantivas é: %d.
                        """, num, soma);

                    

         }
         


        entrada.close();
    }
}
