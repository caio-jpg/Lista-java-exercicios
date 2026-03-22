/* Faça um programa que leia uma temperatura em graus Celsius e converta para
Fahrenheit */

import java.util.Scanner;

public class ex4 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Digite a temperatura em graus Celsius:");
        double celsius = sc.nextDouble();
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.printf("A temperatura em Fahrenheit é: %.2f%n", fahrenheit);
        sc.close();
    }
    
}
