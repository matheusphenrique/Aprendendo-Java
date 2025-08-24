package Exercicios_EstruturaSequencial;
import java.util.Scanner;

//Diferença do produto de A e B pelo o produto de C e D

public class Exercicio_03 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a, b, c, d;
        int difereca;

        System.out.println("Digite o valor de A: ");
        a = sc.nextInt();
        System.out.println("Digite o valor de B: ");
        b = sc.nextInt();
        System.out.println("Digite o valor de C: ");
        c = sc.nextInt();
        System.out.println("Digite o valor de D: ");
        d = sc.nextInt();

        difereca = a * b - c * d;

        System.out.println("DIFERENÇA = " + difereca);

        sc.close();
    }
}
