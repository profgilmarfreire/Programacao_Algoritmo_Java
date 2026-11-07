import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class App {
    public static void main(String[] args) throws Exception {
        
        //Como declarar um ArrayList
        ArrayList <String> nomes = new ArrayList<>();
        
        //01- Metodo: add() - Adiciona Elementos à Lista

        nomes.add("Gilmar");
        nomes.add("Luciano");

        //System.out.println(nomes);

        // 02 Metodo: get(int indice) - Acessa um item
        
        //System.out.println(nomes.get(0));

        //3 Metodo: set(int index, "Elemento") - Alterar um item

        nomes.set(1, "Paulo");
        //System.out.println(nomes);

        //4 metodo remove(int index) - Remover item por posição

        nomes.add("Sofia");

        //System.out.println(nomes);

        nomes.remove(1);

        //System.out.println(nomes);

        //5 Método: size() - Retorna o Tamanho da lista

        //System.out.println(nomes.size());

        //6 Método: clear() - Limpar toda a lista

        //nomes.clear();

        //System.out.println(nomes);

        //7 método: contains("Elemento") - Verificar se existe na lista e retorna um boolean

        //System.out.println(nomes.contains("Gilmar"));

        //8 Metodo: isEmpty()- Verificar se a lista esta vazia e retorna um boolean

        //nomes.clear();
        //System.out.println(nomes.isEmpty());

        //9  metodo: indexOf("Elemento") - Retorna a posição de um item, se não existir ele retorna -1

        nomes.add("Rafael");
        nomes.add("Antonia");
        nomes.add("Gabriel");

        //System.out.println(nomes.indexOf("Sofia"));

        //10 metodo: replaceAll() - Substitui todos os elementos com base em uma unica regra

        //nomes.replaceAll(nome -> nome.toUpperCase());

        //System.out.println(nomes);

        //11 Método: sort() - Ordena a lista em ordem crescente alfabetica e numerica
        // para usar este metodo deve realizar um novo import import java.util.Collections

        //System.out.println(nomes);
        Collections.sort(nomes);

        System.out.println(nomes);

        //12 metodo: forEach() - Loop com interação do arrayList

        //nomes.forEach(nome -> System.out.println("Olá " + nome));

        //13 metodo: visualizar a lista com loop for tradicional

        for(int i = 0; i < nomes.size(); i++){
            System.out.printf("%d° %s \n", i+1, nomes.get(i));
        }
    }
}
