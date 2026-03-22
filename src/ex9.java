/*  Faça um programa que recebe o ano de nascimento e retorne a idade do usuário
utilizando a classe LocalDate. */

import java.time.LocalDate;
import java.util.Scanner;

public class ex9 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Digite o ano de nascimento:");
        int anoNascimento = sc.nextInt();
        int anoAtual = LocalDate.now().getYear();
        int idade = anoAtual - anoNascimento;
        System.out.println("Sua idade é: " + idade + " anos.");
        sc.close();
    }
    
}
