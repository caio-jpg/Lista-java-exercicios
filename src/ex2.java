import java.util.Scanner;
public class ex2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro:");
        int num = sc.nextInt();
        System.out.println("Digite outro número inteiro:");
        int num2 = sc.nextInt();
        System.out.println("A soma de " + num + " e " + num2 + " é " + (num + num2));

        sc.close();

    

    }
}