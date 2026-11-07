import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner inUser = new Scanner(System.in);

        double largura, comprimento, area;


        System.out.println("Seja Bem vindo a nossa loja");
        System.out.println("Qual a largura do terreno?");
        largura = inUser.nextDouble();
        System.out.println("Qual a comprimento do terreno?");
        comprimento = inUser.nextDouble();

        area = largura*comprimento;
        
         System.out.printf("Voce informou que a largura é: %.2f mts, e o comprimento é: %.2fmts . A área do terreno é %.2fmts. \n", largura, comprimento, area);
     
        /*
        Para as saídas formatadas ultilize
        %d para inteiros
        %s para Textos String
        %f para numeros fracionados 
        %b para bleanos
        %c para caracteres

        Ultilize System.out.printf(); para saidas formatadas

        ex:
        System.out.printf("%.2f", largura);

        Obs:

        Para determinar a quantidade de casas decimais após a vírgula use %.2f. Onde o "2" é a quantidade de casas após a virgula

        */


        inUser.close();
    }
}
