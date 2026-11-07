import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);


        int senha = 1234;
        int tentativa = 0;
        int cont = 0;

        do{

            System.out.println("Tente descobrir a minha a senha e escape do loop\n");
            tentativa = leia.nextInt();
            if(tentativa != senha){
                System.out.printf("""
                    Você digitou %d.
                    Tentativa INCORRETA! Tente novamente\n
                """, tentativa);
            }
            cont +=1;
        }while(tentativa != senha);

        System.out.printf("""
            Parabens vc acertou!!!
            Para chegar neste resultado, você tentou %d vezes!
            """, cont);

        leia.close();
    }
}
