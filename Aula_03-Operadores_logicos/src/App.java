public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Operadores Lógicos");

        
        
        double nota = 6;
        int frequencia = 75;
        boolean result;

        /*
        Operador "and &&" as duas condiçoes devem ser verdadeiras
        Operador "or ||" pelo menos 1 condição deve ser verdadeira
        Operador " not ! " nega a saida
        \n pula uma linha
        */

        System.out.println("Operador e" );
        result = (nota >=6 && frequencia >=75);
        System.out.println(result);


         System.out.println("\n Operador ou" );
        result = (nota <=4 || frequencia >=75);
        System.out.println(result);

        System.out.println("\nOperador not" );
        
        System.out.println(result);
        System.out.println(!result);
         System.out.println(!(!result));

        


        
    }
}
