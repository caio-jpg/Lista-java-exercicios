/*  Desenvolva um programa que leia o ano de nascimento do usuário e utilize a
classe LocalDate para obter o ano atual e calcular a idade.  */

import java.time.LocalDate;
import java.util.Scanner;


public class ex7 {
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
