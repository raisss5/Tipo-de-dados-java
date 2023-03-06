import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Float Peso, Altura, Imc;

        
        System.out.println("Informe sua altura : ");
        Altura = input.nextFloat();
        
        System.out.println("Informe seu peso : ");
        Peso = input.nextFloat();

        Imc = Peso / (Altura * Altura);

        System.out.printf("Seu peso é : " + Peso );
         System.out.printf("\n Seu segundo numero foi = " + Altura);

         if (Peso>= 8 && media <= 10 )
         {
             System.out.print("Aluno está Aprovado \n");
         
         } else if (media >= 5 && media <= 7){
             System.out.print("Aprovado, mas terá que fazer recupeção \n");
         } else if (media >= 0 && media <= 4) {
             System.out.print("Aluno está Reprovado\n");
         } else{
             System.out.print("erro na media\n");
         }
         




    

}
}
