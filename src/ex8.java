/*  Crie um programa que leia um valor em reais (R$) e converta para dólares,
considerando uma taxa de câmbio informada pelo usuário  */

import java.util.Scanner;

public class ex8 {
        public static void main (String [] args) {
            System.out.println("Digite o valor em reais (R$):");
            Scanner sc = new Scanner (System.in);
            double reais = sc.nextDouble();
            System.out.println("Digite a taxa de câmbio (R$ para US$):");
            double taxaCambio = sc.nextDouble();
            double dolares = reais / taxaCambio;
            System.out.printf("O valor em dólares é: $%.2f%n", dolares);
            sc.close();





        

        }











}