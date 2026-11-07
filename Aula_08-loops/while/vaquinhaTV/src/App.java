import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner inUser = new Scanner(System.in);
        
        
        double objTv = 6634.05;
        double investimento = 0;
        double saldoAtual =0;
        double restante = 0;
        
        
        System.out.printf("""
                Seja bem vindo a caixinha do Nubank!
                Seu saldo atual é: R$%.2f.
                Seu objetivo é: R$%.2f.
                """, saldoAtual, objTv );

        
        do{

            System.out.println("Quanto voce deseja investir hoje?");
            investimento = inUser.nextDouble();
            saldoAtual += investimento;
            restante = objTv - saldoAtual;


            System.out.printf("""
                Seu saldo atual é: R$%.2f.
                Seu objetivo é: R$%.2f.
                Falta %.2f para alcançar o seu objetivo.
                """,saldoAtual, objTv, restante);

        }while(saldoAtual < objTv);
        


        inUser.close();
    }
}
