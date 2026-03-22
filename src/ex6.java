import java.util.Scanner;


public class ex6 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println ("Digite seu salário atual:");
    double salario = sc.nextDouble();
    double aumento = salario * 0.10;
    double salarioatual = salario + aumento;
    System.out.printf("O salário atualizado com bônus é: R$ %.2f%n", salarioatual);
    sc.close();

    
    
    
    
    
    
    
    
    }

}

      
