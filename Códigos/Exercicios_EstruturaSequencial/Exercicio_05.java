package Exercicios_EstruturaSequencial;
import java.util.Locale;
import java.util.Scanner;

//Valor a ser pago.

public class Exercicio_05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codItem1, NumItem1, codItem2, NumItem2;
        double ValorItem1, ValorItem2, ValorTotal;

        System.out.println("Digite código do Item 1: ");
        codItem1 = sc.nextInt();
        System.out.println("Números de peças Item 1: ");
        NumItem1 = sc.nextInt();
        System.out.println("Valor unitário do Item 1: ");
        ValorItem1 = sc.nextDouble();

        System.out.println();

        System.out.println("Digite código do Item 2: ");
        codItem2 = sc.nextInt();
        System.out.println("Números de peças Item 2: ");
        NumItem2 = sc.nextInt();
        System.out.println("Valor unitário do Item 2: ");
        ValorItem2 = sc.nextDouble();

        System.out.println();

        ValorTotal = NumItem1 * ValorItem1 + NumItem2 * ValorItem2;
        System.out.printf("VALOR A PAGAR R$%.2f%n", ValorTotal);

        sc.close();

    }
}
