import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner inUser = new Scanner(System.in);

        System.out.println("\n");
        double servico = 0;
        double placa = 1850;
        double backup = 150;
        double config = 200;
        double landing = 500;
        double restante = 0;
        double taxa = 10;
        double saldoatual = 0;
        int pagamento;

        System.out.printf("""
            Seja bem-vindo a sua carteira de objetivos!
            Sua meta e R%.2f.
            Seu saldo atual e R%.2f.
            
            """, placa, saldoatual);
        
            
 
        
            do{
 
                System.out.println("""
                   Você concluiu mais um servico!
                   Informe a atividade realizada!
                   
                   1 - Formatacao de PC e Backup (R 150,00)
                   2 - Configuracao de Roteador/Rede (R 200,00)
                   3 - Criacao de Landing Page em HTML/CSS (R 500,00)
                   
                   """);
 
                   int atividade = inUser.nextInt();
 
                   switch(atividade){
                    case 1 -> {
                            System.out.println("""
                                Voce selecionou formatacao e backup
                            """);
                            servico = backup;
                    }
                    
                    case 2 -> {
                        
                        System.out.println("""
                                Voce selecionou Configuração de Roteador/Rede (R 200,00)
                            """);
                            servico = config;
                        
                    }
                    
                    case 3 -> {
                        System.out.println("""
                                Voce selecionou Criação de Landing Page em HTML/CSS (R 500,00)
                            """);
                            servico = landing;
                        
                    }
                    
                    default -> System.out.println("Opção não encontrada");                        
                    
                       
                   }        
                    
                    System.out.println("""
                                
                                Informe a forma de pagamento que voce recebeu do cliente
                                
                                1 - Cartao
                                2 - Pix/Dinheiro

                                    """);
                                pagamento = inUser.nextInt();

                                 if (pagamento == 1) {

                                saldoatual = ((saldoatual + servico) - taxa);
                                restante = placa - saldoatual;                      

                                 System.out.printf("""
                                        O pagamento foi realizado no cartao de credito.
                                        A taxa da maquina foi cobrada!
                                        Seu saldo atual é R$%.2f.
                                        Ainda falta R%.2f para alcancar seu objetivo
                                        
                                        """, saldoatual,restante);  
            
                                } else {
                                    saldoatual += servico;
                                    restante = placa - saldoatual;               
            
                                    System.out.printf("""
                                    O pagamento foi realizado em PIX/Dinheiro.
                                    Seu saldo atual e R$%.2f.
                                    Ainda faltam R%.2f para alcancar seu objetivo
                                    
                                    """, saldoatual, restante);
                                }
                    
                    
                    
 
                 }while(saldoatual < placa);
 
                    System.out.printf("""
                        Parabéns"
                        Você atingiu o seu objetivo R$%.2f.
                        Agora você pode comprar sua ProjetoRTX 4060
                        Seu saldo final é R$%.2f.
                        """, placa, saldoatual);
 
        
        
                        inUser.close();
    }
}
