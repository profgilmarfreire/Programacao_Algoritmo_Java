import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
     Scanner inUser = new Scanner(System.in);

     double valorPagar = 0;
     
     System.out.println("""
                Seja bem vindo ao nosso terminal de transportes, escolha a opção desejada:
                
                1 - Ônibus urbano: R$ 4,40
                2 - Metrô: R$ 5,00
                3 - Trem: R$ 6,50
                4 - Rodoviário: R$ 12,00                
             """);
             int escolha = inUser.nextInt();

             System.out.println("Informe a quantidade de bilheres:\n");
             int qtd = inUser.nextInt();

             switch(escolha){
                case 1 -> {
                    valorPagar = qtd*4.40;

                    System.out.printf("""
                        Voce escolheu Ônibus urbano com %d bilhetes;
                        O valor total a pagar é R$%.2f.
                     \n""", qtd, valorPagar);
                }
                case 2 -> {
                    valorPagar = qtd*5;

                    System.out.printf("""
                        Voce escolheu Metrô com %d bilhetes;
                        O valor total a pagar é R$%.2f.
                     \n""", qtd, valorPagar);
                }
                case 3 -> {
                    valorPagar = qtd*6.5;

                    System.out.printf("""
                        Voce escolheu Trem com %d bilhetes;
                        O valor total a pagar é R$%.2f.
                     \n""", qtd, valorPagar);
                }
                case 4 -> {
                    valorPagar = qtd*5;

                    System.out.printf("""
                        Voce escolheu Ônibus Rodoviário com %d bilhetes;
                        O valor total a pagar é R$%.2f.
                     \n""", qtd, valorPagar);
                }

                default -> System.out.println("ERROR! Valor desconhecido, Informe um valor válido."); 
            }
     
     inUser.close();  
    }
}
