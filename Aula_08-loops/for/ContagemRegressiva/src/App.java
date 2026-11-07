public class App {
    public static void main(String[] args) throws Exception {
        
        for(int i = 3; i>-1; i--){
            if(i == 1){
                System.out.printf("Falta %d dia para a sua morte\n", i);
            }else if(i == 0){
                System.out.println("Você morreu");
            }else{
                System.out.printf("Faltam %d dias para a sua morte\n", i);
            }
            
        }
    }
}
