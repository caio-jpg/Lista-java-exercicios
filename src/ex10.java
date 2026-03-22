/* Desenvolva um programa que leia a idade de uma pessoa e utilize uma estrutura
de decisão para classificá-la nas seguintes categorias: criança (0 a 12 anos),
adolescente (13 a 17 anos), adulto (18 a 59 anos) e idoso (60 anos ou mais). */


import java.util.Scanner;

public class ex10 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);  
        System.out.println("Digite a idade da pessoa:");
        int idade = sc.nextInt();
        if (idade >= 0 && idade <= 12) {
            System.out.println("A pessoa é uma criança.");
        } else if (idade >= 13 && idade <= 17) {
            System.out.println("A pessoa é um adolescente.");
        } else if (idade >= 18 && idade <= 59) {
            System.out.println("A pessoa é um adulto.");
        } else if (idade >= 60) {
            System.out.println("A pessoa é um idoso.");
        }else{
            System.out.println("Digite uma idade válida");
        }
        sc.close();



    }
    
}
