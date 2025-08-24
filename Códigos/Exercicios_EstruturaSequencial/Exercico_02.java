package Exercicios_EstruturaSequencial;
import java.util.Scanner;

//Raio de um círculo.

public class Exercico_02 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double raio, area;
        double pi = 3.14159;

        System.out.println("Escreva o valor do raio do círculo: ");
        raio = sc.nextDouble();

        area = pi * (Math.pow(raio, 2.0));

        System.out.printf("A = %.4f%n" , area);
        
        sc.close();
    }
}
