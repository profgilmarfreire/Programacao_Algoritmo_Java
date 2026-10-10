public class App {
    public static void main(String[] args) throws Exception {
        
        for(int i = 1; i<=30; i++){
            if(i % 4 == 0){
                System.out.printf("%d É multiplo dej 4\n", i);
            }else{
                System.out.println(i);
            }
        }
}
}