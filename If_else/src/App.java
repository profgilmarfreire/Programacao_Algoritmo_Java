public class App {
    public static void main(String[] args) throws Exception {
       double nota1, nota2, nota3, media;
       nota1 = 7.5;
       nota2 = 5.5;
       nota3 = 2.5;

       media = (nota1 + nota2 + nota3)/3;
       if(media >=6){
        System.out.println("A média do Aluno e " + media + " e ele foi Aprovado");
       }else{
        System.out.println("A média do Aluno e " + media + "e ele foi Reprovado");
       }

    }
}
