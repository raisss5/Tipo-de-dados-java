import java.util.Scanner;

public class WillMeuFa {
    public static void main(String[] args){


        Scanner input = new Scanner(System.in);
        String nome;
        int idade;

        
        System.out.println("Insire seu nome: ");
        nome = input.next();
        
        
        System.out.println("Insire sua idade : ");
        idade = input.nextInt();

        if (idade >= 0 && idade <= 12){
            System.out.printf("Voce é uma criança ! \n" );
         }

         else if(idade >=13 && idade <= 17){
            System.out.printf("Voce é um adolescente! \n" );
         }

         else if(idade >=18 && idade <= 59){
            System.out.printf("Voce é adulto!  \n" );
         }

         else if(idade >= 60 ){
            System.out.printf("Voce é idoso! \n ");
         }



        }
}
