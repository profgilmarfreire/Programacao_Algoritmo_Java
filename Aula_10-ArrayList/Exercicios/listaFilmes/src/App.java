import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        //FALTA TERMINAR OS ITENS DO MENU
        Scanner entrada = new Scanner(System.in);

        int escolha;
        
        ArrayList<String> listaFilmes = new ArrayList<>();

        System.out.println("====== Bem vindo a sua lista de filmes ======\n");

    
        do{ 
            
            System.out.println("""

                Escolha a opcao desejada
                
                1 - Cadastrar um novo filme ou série.
                2 - Visualizar todos os títulos já cadastrados.
                3 - Alterar um Filme ou Série da sua lista
                4 - Excluir um título da lista.
                5 - Apagar a lista
                6 - Sair do programa.    

                """);
                escolha = entrada.nextInt();
                entrada.nextLine();

                switch(escolha){
                    case 1 -> {
                        System.out.println("""
                            Você escolheu Adicionar um novo Item a sua lista;                            
                            Didite o nome do Filme ou Serie
                            """);
                        String novoItem = entrada.nextLine();
                        listaFilmes.add(novoItem); 
                    }
                    case 2 -> {
                        if(listaFilmes.isEmpty() == true){
                            System.out.println("""
                                    ERROR"
                                    Sua lista está vazia"
                                    Adicione um item para visualizar

                                    """);
                        }else{
                            System.out.println("====== LISTA DE FILMES E SERIES PARA ASSISTIR  ======");

                            for(int i = 0; i < listaFilmes.size(); i++){ 
                                System.out.printf("%d° - %s;\n", i+1, listaFilmes.get(i));
                            }

                        }
                        
                        
                    }
                    case 3 ->{
                        System.out.println("""
                            Voce escolheu Alterar um item da lista
                            Escolha o numero que quer alterar:    
                        """);

                        for(int i = 0; i < listaFilmes.size(); i++){ 
                                System.out.printf("%d° - %s;\n", i+1, listaFilmes.get(i));
                        }
                        
                        int alterarFilme = entrada.nextInt();
                        entrada.nextLine();

                        System.out.println("\nDigite o nome do novo titulo");
                        String novoTitulo = entrada.nextLine();

                        listaFilmes.set(alterarFilme -1, novoTitulo);

                        System.out.println("\nNome Alterado com Sucesso!\n");

                        System.out.println("====== LISTA DE FILMES E SERIES PARA ASSISTIR  ======\n");

                            for(int i = 0; i < listaFilmes.size(); i++){ 
                                System.out.printf("%d° - %s;\n", i+1, listaFilmes.get(i));
                            }  
                    }


                    case 5 -> {
                        System.out.println("Você escolheu sair");                        
                    }
                    default ->{
                        System.out.println("""
                            ERROR! opcao invalida
                            escolha um opcao valida
                            
                        """);
                    }                    
                }

        }while(escolha != 6);








                

        entrada.close();
    }
}
