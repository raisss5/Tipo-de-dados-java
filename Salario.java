
import java.util.Scanner;

public class Salario {
    Scanner input = new Scanner(System.in);
    double salarioAtual, salarioNovo ;

    System.out.println("Informe seu salário atual: ");
    salarioAtual = input.nextFloat();

    System.out.println("Informe seu salário novo: ");
    salarioNovo = input.nextFloat() ;

    if (salarioAtual >= 1000 && SalarioNovo <= 2000){
        salarioAtual = salarioNovo * 1.15;

    }
    else if (SalarioAtual >= 2000 && SalarioNovo <= 3000){
        salarioAtual = salarioNovo * 1.10;
    }else if (SalarioAtual >= 3000){
        salarioAtual = salarioNovo * 1.05;
    }
}